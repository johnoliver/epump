package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;
import com.kodewerk.epump.SinkPoint;

public class IntegerEvent implements Event<Query> {

    private int value;

    public IntegerEvent(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void writeTo(Query query) {
        query.processEvent(this);
    }
}
