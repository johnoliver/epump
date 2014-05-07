package com.kodewerk.epump.test;

import com.kodewerk.epump.Event;


public class IntegerSumQuery extends Query<IntegerEvent> {

    private int sum = 0;

    @Override
    public void accept(IntegerEvent event) {
        sum += event.getValue();
    }

    public String toString() {
        return Integer.toString(sum);
    }
}
