package com.kodewerk.epump.test;

public class DoubleSumQuery extends Query<DoubleEvent> {

    private double sum = 0.0d;

    public String toString() {
        return Double.toString(sum);
    }

    @Override
    public void accept(DoubleEvent event) {
        sum += event.getValue();
    }
}
