package com.calvinlsliang.caltrainschedule.model;


public class StopTimesKey {

    private final int tripId;
    private final String stopName;

    public StopTimesKey(int tripId, String stopName) {
        this.tripId = tripId;
        this.stopName = stopName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StopTimesKey)) return false;

        StopTimesKey key = (StopTimesKey) o;
        return this.tripId == key.tripId && this.stopName.equals(key.stopName);
    }

    @Override
    public int hashCode() {
        return 31 * tripId + stopName.hashCode();
    }
}
