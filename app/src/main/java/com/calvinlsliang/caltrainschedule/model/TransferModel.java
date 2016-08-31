package com.calvinlsliang.caltrainschedule.model;


public class TransferModel {
    public int bus;
    public int busIndex;
    public String location;
    public String time;

    public TransferModel(int bus, int busIndex, String location, String time) {
        this.bus = bus;
        this.busIndex = busIndex;
        this.location = location;
        this.time = time;
    }
}
