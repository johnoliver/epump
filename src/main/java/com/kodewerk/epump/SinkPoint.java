package com.kodewerk.epump;


/**
 * Terminating point of the call back. Clients must implement this interface in order to register
 * themselves with the event pump.
 * <p/>
 * todo: This will be called with a (per client) guard thread. Exceptions thrown here shouldn't
 * kill the main event pump loop.
 */
public interface SinkPoint<E extends Event> {

    public void accept(E event);
}
