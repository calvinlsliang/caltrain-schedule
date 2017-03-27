package com.calvinlsliang.caltrainschedule.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class ConstantsHelper {
    public static Constants getConstants() {
        try {
            if ((new Date()).before(DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH).parse("4/10/2017"))) {
                return new ConstantsInitial();
            } else {
                return new ConstantsSpring2017();
            }
        } catch (ParseException e) {
            // no-op
        }

        return new ConstantsInitial();
    }

    public static VERSION getVersion() {
        try {
            if ((new Date()).before(DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH).parse("4/10/2017"))) {
                return VERSION.INITIAL;
            } else {
                return VERSION.SPRING_2017;
            }
        } catch (ParseException e) {
            // no-op
        }

        return VERSION.INITIAL;
    }

    public static Constants getConstantsFromVersion(VERSION version) {
        if (version == VERSION.INITIAL) {
            return new ConstantsInitial();
        } else if (version == VERSION.SPRING_2017) {
            return new ConstantsSpring2017();
        }
        return null;
    }

    public enum VERSION {
        INITIAL (0),
        SPRING_2017 (1),
        SUMMER_2017 (2);

        private int value;

        VERSION(int value) {
            this.value = value;
        }

        public static int valueOf(VERSION version) {
            return version.value;
        }
    }
}
