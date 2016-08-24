package com.calvinlsliang.caltrainscheduler.model;


public class TransferModel {
    public int bus;
    public String location;
    public String time;

    public TransferModel(int bus, String location, String time) {
        this.bus = bus;
        this.location = location;
        this.time = time;
    }
}
