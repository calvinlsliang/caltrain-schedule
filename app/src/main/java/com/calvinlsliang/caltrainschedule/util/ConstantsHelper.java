package com.calvinlsliang.caltrainschedule.util;

public class ConstantsHelper {
    public static Constants getConstants() {
        // TODO: 3/26/17 date logic here
        return new ConstantsInitial();
    }

    public static VERSION getVersion() {
        // TODO: 3/26/17 date logic here
        return VERSION.INITIAL;
    }

    public enum VERSION {
        INITIAL,
        SPRING_2017,
        SUMMER_2017
    }
}
