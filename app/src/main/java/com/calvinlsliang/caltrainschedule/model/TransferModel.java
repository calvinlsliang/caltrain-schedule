package com.calvinlsliang.caltrainschedule.model;


public class TransferModel {
    public final int bus;
    public final int busIndex;
    public final String location;
    public final String time;

    public TransferModel(int bus, int busIndex, String location, String time) {
        this.bus = bus;
        this.busIndex = busIndex;
        this.location = location;
        this.time = time;
    }
}
