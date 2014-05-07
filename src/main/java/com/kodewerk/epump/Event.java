package com.kodewerk.epump;

public interface Event<E extends Event> {

    public void writeTo(SinkPoint<E> sinkPoint);

}
