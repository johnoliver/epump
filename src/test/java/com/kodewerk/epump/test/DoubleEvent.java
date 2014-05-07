package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;

public class DoubleEvent implements Event<Query> {

    private double value;

    public DoubleEvent( double value) {
        this.value = value;
    }

    public double getValue() { return value; }

    @Override
    public void writeTo(Query sinkPoint) {
        sinkPoint.processEvent(this);
    }
}
