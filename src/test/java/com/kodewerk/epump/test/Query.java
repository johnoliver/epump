package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;
import com.kodewerk.epump.SinkPoint;

public abstract class Query<E extends Event> implements SinkPoint<E> {

    public void processEvent(IntegerEvent event) {}
    public void processEvent(DoubleEvent event) {}

}
