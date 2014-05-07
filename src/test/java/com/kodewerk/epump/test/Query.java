package com.kodewerk.epump.test;

import com.kodewerk.epump.SinkPoint;

public abstract class Query implements SinkPoint<Query> {

    public void processEvent(IntegerEvent event) {}
    public void processEvent(DoubleEvent event) {}

}
