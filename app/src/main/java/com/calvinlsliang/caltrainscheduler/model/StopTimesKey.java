package com.calvinlsliang.caltrainscheduler.model;


public class StopTimesKey {

    private final String tripId;

    private final String stopId;

    public StopTimesKey(String stopId, String tripId) {
        this.stopId = stopId;
        this.tripId = tripId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StopTimesKey)) return false;

        StopTimesKey key = (StopTimesKey) o;
        return this.tripId == key.tripId && this.stopId == key.stopId;
    }

    @Override
    public int hashCode() {
        return 31 * tripId.hashCode() + stopId.hashCode();
    }
}
