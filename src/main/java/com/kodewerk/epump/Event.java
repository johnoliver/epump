package com.kodewerk.epump;

public interface Event<T extends SinkPoint> {

    public void writeTo(T sinkPoint);

}
