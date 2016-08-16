package com.calvinlsliang.caltrainscheduler.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimesModel {

    private final SimpleDateFormat format = new SimpleDateFormat("HH:mm", Locale.getDefault());

    public String startTime;
    public String endTime;
    public String busNumber;
    public String duration;

    public TimesModel() {
    }

    public TimesModel(String startTime, String endTime, int busNumber) {
        final DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
        try {
            final Date startDate = format.parse(startTime);
            final Date endDate = format.parse(endTime);

            this.startTime = dateFormat.format(startDate);
            this.endTime = dateFormat.format(endDate);
            this.duration = TimeUnit.MILLISECONDS.toMinutes(endDate.getTime() - startDate.getTime()) + " min";

        } catch (ParseException | NullPointerException e) {
        }
        this.busNumber = "#" + busNumber;
    }
}
