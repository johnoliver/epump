package com.kodewerk.epump.test;


import com.kodewerk.epump.Event;

public class ThrowsDivideByZeroQuery extends Query<IntegerEvent> {

    private int sum = 0;

    @Override
    public void accept(IntegerEvent event) {
        sum += event.getValue() / sum;
    }

    public String toString() {
        return Integer.toString( sum);
    }
}
