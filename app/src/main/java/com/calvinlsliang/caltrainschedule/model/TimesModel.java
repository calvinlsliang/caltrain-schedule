package com.calvinlsliang.caltrainschedule.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimesModel {

    private static final SimpleDateFormat format = new SimpleDateFormat("hh:mm aa", Locale.getDefault());

    public String startTime;
    public String endTime;
    public String busNumber;
    public String duration;
    public String transferLocation;
    public String transferTime;

    public TimesModel() {
    }

    public TimesModel(String startTime, String endTime, int busNumber) {
        try {
            final Date startDate = format.parse(startTime);
            Date endDate = format.parse(endTime);

            if (startDate.after(endDate)) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(endDate);
                calendar.add(Calendar.DATE, 1);
                endDate = calendar.getTime();
            }

            this.startTime = startTime;
            this.endTime = endTime;
            this.duration = TimeUnit.MILLISECONDS.toMinutes(endDate.getTime() - startDate.getTime()) + " min";

        } catch (ParseException | NullPointerException e) {
            e.printStackTrace();
        }
        this.busNumber = "#" + busNumber;
    }

    public void setTransferLocation(String transferLocation) {
        this.transferLocation = transferLocation;
    }

    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }
}
