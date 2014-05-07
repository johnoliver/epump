package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;
import com.kodewerk.epump.SinkPoint;

public class LongEvent implements Event<LongSumQuery> {

    private long value;

    public LongEvent(long value) {
        this.value = value;
    }

    public long getValue() { return this.value; }

    public void execute(LongSumQuery query) {
        query.processEvent(this);
    }

    @Override
    public void writeTo(LongSumQuery sinkPoint) {
        this.execute(sinkPoint);
    }
}
