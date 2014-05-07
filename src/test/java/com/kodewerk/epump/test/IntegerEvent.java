package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;
import com.kodewerk.epump.SinkPoint;

public class IntegerEvent implements Event<IntegerEvent> {

    private int value;

    public IntegerEvent(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void writeTo(SinkPoint<IntegerEvent> sinkPoint) {
        sinkPoint.accept(this);
    }
}
