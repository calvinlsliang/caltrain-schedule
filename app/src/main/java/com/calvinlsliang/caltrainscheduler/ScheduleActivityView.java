package com.calvinlsliang.caltrainscheduler;

import com.calvinlsliang.caltrainscheduler.model.TimesModel;

import java.util.List;

/**
 * Created by calvin on 8/6/16.
 */

public interface ScheduleActivityView {
    void setTimesList(List<TimesModel> timesModel);
}
