package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;
import com.kodewerk.epump.SinkPoint;

public class LongEvent implements Event {

    private long value;

    public LongEvent(long value) {
        this.value = value;
    }

    public long getValue() { return this.value; }

    public void execute(LongSumQuery query) {
        query.processEvent(this);
    }

    public void writeTo(SinkPoint sinkPoint) {
        this.execute((LongSumQuery) sinkPoint);
    }
}
