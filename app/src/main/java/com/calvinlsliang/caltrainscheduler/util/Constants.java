package com.calvinlsliang.caltrainscheduler.util;

import java.util.Arrays;
import java.util.List;

/**
 * Created by calvin on 8/6/16.
 */

public class Constants {

    public static final List<String> DESTINATIONS = Arrays.asList(
            "San Francisco", "22nd Street", "Bayshore", "South San Francisco", "San Bruno",
            "Millbrae"  , "Broadway Weekend only", "Burlingame", "San Mateo", "Hayward Park",
            "Hillsdale", "Belmont", "San Carlos", "Redwood City", "Atherton Weekend only",
            "Menlo Park", "Palo Alto", "California Ave", "San Antonio", "Mountain View",
            "Sunnyvale", "Lawrence", "Santa Clara", "College Park", "San Jose Diridon",
            "Tamien", "Capitol", "Blossom Hill", "Morgan Hill", "San Martin",
            "Gilroy"
    );

    public static final List<String> NORTHBOUND_DESTINATIONS = Arrays.asList(
            "Gilroy", "San Martin", "Morgan Hill", "Blossom Hill", "Capitol", "Tamien", "San Jose Diridon", "College Park", "Santa Clara", "Lawrence", "Sunnyvale", "Mountain View", "San Antonio", "California Ave", "Palo Alto", "Menlo Park", "Redwood City", "San Carlos", "Belmont", "Hillsdale", "Hayward Park", "San Mateo", "Burlingame", "Millbrae", "San Bruno", "So. San Francisco", "Bayshore", "22nd Street", "San Francisco"
    );


    public static final List<Integer> NORTHBOUND_TRAIN_IDS = Arrays.asList(
            101, 103, 305, 207, 309, 211, 313, 215, 217, 319,
            221, 323, 225, 227, 329, 231, 233, 135, 237, 139,
            143, 147, 151, 155, 257, 159, 261, 263, 365, 267,
            269, 371, 273, 375, 277, 279, 381, 283, 385, 287,
            289, 191, 193, 195, 197, 199
    );

    public static final List<Integer> SOUTHBOUND_TRAIN_IDS = Arrays.asList(
            102, 104, 206, 208, 210, 312, 314, 216, 218, 220,
            322, 324, 226, 228, 230, 332, 134, 236, 138, 142,
            146, 150, 152, 254, 156, 258, 360, 262, 264, 366,
            268, 370, 272, 274, 376, 278 //, 380, 282, 284, 386,
            //288, 190, 192, 194, 196, 198
    );
}
