package com.otto;

import com.squareup.otto.Bus;

/**
 * Created by Hari Prasad on 11/14/16.
 */
public class BusProvider {
    private static BusProvider ourInstance = new BusProvider();

    public static BusProvider getInstance() {
        return ourInstance;
    }

    private BusProvider() {
    }

    private Bus bus = new Bus();


    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
