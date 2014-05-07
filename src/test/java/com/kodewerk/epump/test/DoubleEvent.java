package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;
import com.kodewerk.epump.SinkPoint;

public class DoubleEvent implements Event<DoubleEvent> {

    private double value;

    public DoubleEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void writeTo(SinkPoint<DoubleEvent> sinkPoint) {
        sinkPoint.accept(this);
    }
}
