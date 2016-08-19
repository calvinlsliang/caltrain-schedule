package com.calvinlsliang.caltrainscheduler.util;

import java.util.Arrays;
import java.util.List;

public class WeekdayConstants {

    public static final String[][] NORTHBOUND = {
            {null, null, null, null, null, null, null, null, "6:06", null, "6:28", null, null, "7:06", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, "6:15", null, "6:37", null, null, "7:15", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, "6:21", null, "6:43", null, null, "7:21", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, "6:36", null, "6:56", null, null, "7:36", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, "6:42", null, "7:02", null, null, "7:42", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {null, "4:58", null, "5:50", "5:56", null, null, null, "6:50", "6:56", "7:10", null, null, "7:50", "7:56", null, "8:33", null, "9:43", null, null, null, null, null, "14:33", null, "15:38", "16:01", null, null, "16:33", null, "17:01", null, null, "17:33", null, "6:01", null, "6:24", null, null, null, "8:23", "9:23", null},
            {"4:30", "5:05", "5:45", "5:57", "6:03", "6:19", "6:45", "6:50", "6:57", "7:03", "7:18", "7:45", "7:50", "7:57", "8:03", "8:22", "8:40", "9:15", "9:50", "10:15", "11:10", "12:10", "13:10", "14:15", "14:40", "15:05", "15:45", "16:08", "16:22", "16:31", "16:40", "16:45", "17:08", "17:22", "17:31", "17:40", "5:45", "6:08", "6:22", "6:31", "6:45", "6:50", "7:30", "8:30", "9:30", "10:30"},
            {null, null, null, null, null, null, null, null, null, null, null, null, null, "8:01", null, null, null, null, null, null, null, null, null, null, null, "15:09", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
            {"4:36", "5:11", null, "6:04", null, "6:25", null, null, "7:04", null, "7:24", null, null, "8:06", null, "8:28", "8:46", "9:21", "9:56", "10:21", "11:16", "12:16", "13:16", "14:21", "14:46", "15:13", "15:51", "16:14", null, null, "16:46", null, "17:14", null, null, "17:46", null, "6:14", null, null, null, "6:56", "7:36", "8:36", "9:36", "10:36"},
            {"4:41", "5:16", null, "6:14", null, null, null, null, "7:14", null, "7:29", null, null, "8:16", null, null, "8:52", "9:26", "10:01", "10:26", "11:22", "12:22", "13:22", "14:25", "14:51", "15:18", "15:56", null, null, "16:40", "16:54", null, null, null, "17:40", "17:54", null, null, null, "6:40", "6:54", "7:01", "7:41", "8:41", "9:41", "10:41"},
            {"4:45", "5:20", null, "6:21", "6:16", "6:33", null, "7:02", "7:21", "7:16", "7:34", null, "8:02", "8:23", "8:16", "8:36", "8:57", "9:31", "10:05", "10:31", "11:26", "12:26", "13:26", "14:31", "14:55", "15:22", "16:00", null, null, null, "17:00", null, null, null, null, "18:00", null, null, null, null, null, "7:05", "7:46", "8:46", "9:46", "10:46"},
            {"4:50", "5:25", "6:00", "6:26", null, "6:39", "7:00", "7:07", "7:26", null, "7:40", "8:00", "8:07", "8:29", null, "8:42", "9:03", "9:37", "10:11", "10:37", "11:31", "12:31", "13:31", "14:37", "15:00", "15:27", "16:05", null, "16:35", "16:48", "17:05", "17:00", null, "17:35", "17:48", "18:05", "6:00", null, "6:35", "6:48", "7:01", "7:10", "7:51", "8:51", "9:51", "10:51"},
            {"4:54", "5:29", null, "6:30", null, null, null, null, "7:30", null, null, null, null, "8:33", null, null, "9:07", "9:41", "10:15", "10:41", "11:34", "12:34", "13:34", "14:41", "15:04", "15:31", "16:09", null, null, null, "17:09", null, null, null, null, "18:09", null, null, null, null, null, null, "7:55", "8:55", "9:55", "10:55"},
            {"4:58", "5:33", null, "6:34", null, null, null, "7:14", "7:34", null, null, null, "8:14", "8:37", null, null, "9:11", "9:45", "10:19", "10:45", "11:38", "12:38", "13:38", "14:45", "15:08", "15:35", "16:13", null, null, null, "17:14", null, null, null, null, "18:14", null, null, null, null, "7:07", "7:18", "7:59", "8:59", "9:59", "10:59"},
            {"5:02", "5:37", "6:08", "6:39", "6:26", null, "7:08", "7:19", "7:39", "7:26", null, "8:08", "8:19", "8:42", "8:27", null, "9:18", "9:49", "10:24", "10:49", "11:42", "12:42", "13:42", "14:49", "15:12", "15:40", "16:18", "16:29", "16:44", "16:56", "17:20", "17:08", "17:29", "17:44", "17:56", "18:20", "6:08", "6:29", "6:44", "6:56", "7:11", "7:22", "8:04", "9:04", "10:04", "11:04"},
            {"5:05", "5:40", null, "6:42", null, "6:48", null, null, "7:42", null, "7:48", null, null, "8:45", null, "8:51", "9:21", "9:52", "10:27", "10:52", "11:45", "12:45", "13:45", "14:52", "15:15", "15:43", "16:21", null, "16:48", "16:59", "17:23", null, null, "17:48", "17:59", "18:23", null, null, "6:48", "6:59", "7:14", "7:25", "8:07", "9:07", "10:07", "11:07"},
            {"5:10", "5:45", null, "6:48", "6:33", "6:54", null, null, "7:48", "7:33", "7:54", null, null, "8:51", "8:35", "8:57", "9:27", "9:58", "10:32", "10:58", "11:51", "12:51", "13:51", "14:58", "15:20", "15:48", "16:27", "16:37", "16:54", null, "17:29", null, "17:37", "17:54", null, "18:29", null, "6:37", "6:54", null, "7:20", "7:30", "8:12", "9:12", "10:12", "11:12"},
            {"5:14", "5:49", null, null, null, "6:58", null, "7:27", null, null, "7:58", null, "8:27", null, null, "9:01", "9:31", "10:02", "10:36", "11:02", "11:55", "12:55", "13:55", "15:02", "15:24", "15:52", "16:31", "16:41", null, "17:06", "17:33", null, "17:41", null, "18:06", "18:33", null, "6:41", null, "7:06", "7:24", "7:34", "8:16", "9:16", "10:16", "11:16"},
            {"5:17", "5:52", null, null, null, "7:02", null, null, null, null, "8:01", null, null, null, null, "9:05", "9:34", "10:05", "10:39", "11:05", "11:58", "12:58", "13:58", "15:05", "15:27", "15:55", null, "16:45", null, null, null, null, "17:45", null, null, null, null, "6:45", null, null, null, "7:37", "8:20", "9:20", "10:20", "11:20"},
            {"5:20", "5:55", "6:19", "6:54", null, "7:05", "7:19", "7:33", "7:54", null, "8:05", "8:19", "8:33", "8:59", null, "9:08", "9:38", "10:08", "10:42", "11:08", "12:02", "13:02", "14:02", "15:08", "15:30", "15:58", null, "16:49", null, "17:10", null, "17:19", "17:49", null, "18:10", null, "6:19", "6:49", null, "7:10", "7:29", "7:40", "8:23", "9:23", "10:23", "11:23"},
            {"5:23", "5:58", null, null, null, "7:09", null, null, null, null, "8:08", null, null, null, null, "9:12", null, "10:11", null, "11:11", "12:05", "13:05", "14:05", "15:11", null, "16:01", null, "16:52", null, null, null, null, "17:52", null, null, null, null, "6:52", null, null, null, "7:43", "8:26", "9:26", "10:26", "11:26"},
            {"5:26", "6:01", null, null, "6:42", "7:12", null, "7:38", null, "7:42", "8:11", null, "8:38", null, "8:44", "9:15", "9:42", "10:15", "10:47", "11:15", "12:08", "13:08", "14:08", "15:15", "15:34", "16:04", "16:38", "16:55", null, "17:14", "17:40", null, "17:55", null, "18:14", "18:40", null, "6:55", null, "7:14", "7:33", "7:46", "8:29", "9:29", "10:29", "11:29"},
            {"5:30", "6:05", null, null, null, "7:16", null, "7:42", null, null, "8:15", null, "8:42", null, null, "9:19", "9:46", "10:18", "10:51", "11:18", "12:12", "13:12", "14:12", "15:18", "15:38", "16:08", null, "15:59", null, "17:18", null, null, "17:59", null, "18:18", null, null, "6:59", null, "7:18", "7:37", "7:50", "8:33", "9:33", "10:33", "11:33"},
            {"5:35", "6:10", "6:29", "7:03", "6:50", "7:21", "7:29", null, "8:03", "7:50", "8:21", "8:29", null, "9:08", "8:52", "9:24", "9:51", "10:23", "10:56", "11:23", "12:17", "13:17", "14:17", "15:23", "15:43", "16:13", "16:46", "17:04", "17:09", null, "17:48", "17:29", "18:04", "18:09", null, "18:48", "6:29", "7:04", "7:09", null, "7:43", "7:55", "8:38", "9:38", "10:38", "11:38"},
            {"5:39", "6:14", null, null, null, "7:25", null, "7:48", null, null, "8:25", null, "8:48", null, null, "9:29", "9:55", "10:27", "11:00", "11:27", "12:21", "13:21", "14:21", "15:27", "15:47", "16:17", null, "17:08", null, "17:25", null, null, "18:08", null, "18:25", null, null, "7:08", null, "7:25", null, "7:59", "8:42", "9:42", "10:42", "11:42"},
            {"5:43", "6:18", null, "7:09", null, "7:29", null, null, "8:09", null, "8:29", null, null, "9:14", null, "9:32", null, "10:31", null, "11:31", "12:25", "13:25", "14:25", "15:31", null, "16:21", null, "17:13", null, null, null, null, "18:13", null, null, null, null, "7:13", null, null, null, "8:03", "8:46", "9:46", "10:46", "11:46"},
            {"5:49", "6:24", null, null, null, "7:37", null, null, null, null, "8:37", null, null, null, null, "9:38", null, "10:37", null, "11:37", "12:31", "13:31", "14:31", "15:37", null, "16:27", null, "17:19", null, null, null, null, "18:19", null, null, null, null, "7:19", null, null, null, "8:09", "8:52", "9:52", "10:52", "11:52"},
            {"5:54", "6:29", null, null, null, "7:44", null, null, null, null, "8:44", null, null, null, null, "9:44", null, "10:43", null, "11:43", "12:37", "13:37", "14:37", "15:43", null, "16:32", "16:58", "17:25", "17:21", "17:35", "18:00", "17:43", "18:25", "18:21", "18:35", "19:00", "6:43", "7:25", "7:21", "7:35", "7:55", "8:14", "8:57", "9:57", "10:57", "11:57"},
            {"6:03", "6:38", "6:47", "7:22", "7:07", "7:51", "7:47", "8:03", "8:22", "8:07", "8:51", "8:47", "9:03", "9:27", "9:09", "9:50", "10:09", "10:50", "11:15", "11:50", "12:43", "13:43", "14:43", "15:50", "15:04", "16:40", "17:06", "17:32", "17:27", "17:43", "18:06", "17:49", "18:33", "18:27", "18:43", "19:06", "6:49", "7:32", "7:27", "7:43", "8:02", "8:23", "9:04", "10:04", "11:04", "12:04"}
    };

    public static final List<List<String>> NORTHBOUND2 = Arrays.asList(
            Arrays.asList(null, null, null, null, null, null, null, null, "6:06", null, "6:28", null, null, "7:06", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null),
            Arrays.asList(null, null, null, null, null, null, null, null, "6:15", null, "6:37", null, null, "7:15", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null),
            Arrays.asList(null, null, null, null, null, null, null, null, "6:21", null, "6:43", null, null, "7:21", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null),
            Arrays.asList(null, null, null, null, null, null, null, null, "6:36", null, "6:56", null, null, "7:36", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null),
            Arrays.asList(null, null, null, null, null, null, null, null, "6:42", null, "7:02", null, null, "7:42", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null),
            Arrays.asList(null, "4:58", null, "5:50", "5:56", null, null, null, "6:50", "6:56", "7:10", null, null, "7:50", "7:56", null, "8:33", null, "9:43", null, null, null, null, null, "14:33", null, "15:38", "16:01", null, null, "16:33", null, "17:01", null, null, "17:33", null, "6:01", null, "6:24", null, null, null, "8:23", "9:23", null),
            Arrays.asList("4:30", "5:05", "5:45", "5:57", "6:03", "6:19", "6:45", "6:50", "6:57", "7:03", "7:18", "7:45", "7:50", "7:57", "8:03", "8:22", "8:40", "9:15", "9:50", "10:15", "11:10", "12:10", "13:10", "14:15", "14:40", "15:05", "15:45", "16:08", "16:22", "16:31", "16:40", "16:45", "17:08", "17:22", "17:31", "17:40", "5:45", "6:08", "6:22", "6:31", "6:45", "6:50", "7:30", "8:30", "9:30", "10:30"),
            Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, "8:01", null, null, null, null, null, null, null, null, null, null, null, "15:09", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null),
            Arrays.asList("4:36", "5:11", null, "6:04", null, "6:25", null, null, "7:04", null, "7:24", null, null, "8:06", null, "8:28", "8:46", "9:21", "9:56", "10:21", "11:16", "12:16", "13:16", "14:21", "14:46", "15:13", "15:51", "16:14", null, null, "16:46", null, "17:14", null, null, "17:46", null, "6:14", null, null, null, "6:56", "7:36", "8:36", "9:36", "10:36"),
            Arrays.asList("4:41", "5:16", null, "6:14", null, null, null, null, "7:14", null, "7:29", null, null, "8:16", null, null, "8:52", "9:26", "10:01", "10:26", "11:22", "12:22", "13:22", "14:25", "14:51", "15:18", "15:56", null, null, "16:40", "16:54", null, null, null, "17:40", "17:54", null, null, null, "6:40", "6:54", "7:01", "7:41", "8:41", "9:41", "10:41"),
            Arrays.asList("4:45", "5:20", null, "6:21", "6:16", "6:33", null, "7:02", "7:21", "7:16", "7:34", null, "8:02", "8:23", "8:16", "8:36", "8:57", "9:31", "10:05", "10:31", "11:26", "12:26", "13:26", "14:31", "14:55", "15:22", "16:00", null, null, null, "17:00", null, null, null, null, "18:00", null, null, null, null, null, "7:05", "7:46", "8:46", "9:46", "10:46"),
            Arrays.asList("4:50", "5:25", "6:00", "6:26", null, "6:39", "7:00", "7:07", "7:26", null, "7:40", "8:00", "8:07", "8:29", null, "8:42", "9:03", "9:37", "10:11", "10:37", "11:31", "12:31", "13:31", "14:37", "15:00", "15:27", "16:05", null, "16:35", "16:48", "17:05", "17:00", null, "17:35", "17:48", "18:05", "6:00", null, "6:35", "6:48", "7:01", "7:10", "7:51", "8:51", "9:51", "10:51"),
            Arrays.asList("4:54", "5:29", null, "6:30", null, null, null, null, "7:30", null, null, null, null, "8:33", null, null, "9:07", "9:41", "10:15", "10:41", "11:34", "12:34", "13:34", "14:41", "15:04", "15:31", "16:09", null, null, null, "17:09", null, null, null, null, "18:09", null, null, null, null, null, null, "7:55", "8:55", "9:55", "10:55"),
            Arrays.asList("4:58", "5:33", null, "6:34", null, null, null, "7:14", "7:34", null, null, null, "8:14", "8:37", null, null, "9:11", "9:45", "10:19", "10:45", "11:38", "12:38", "13:38", "14:45", "15:08", "15:35", "16:13", null, null, null, "17:14", null, null, null, null, "18:14", null, null, null, null, "7:07", "7:18", "7:59", "8:59", "9:59", "10:59"),
            Arrays.asList("5:02", "5:37", "6:08", "6:39", "6:26", null, "7:08", "7:19", "7:39", "7:26", null, "8:08", "8:19", "8:42", "8:27", null, "9:18", "9:49", "10:24", "10:49", "11:42", "12:42", "13:42", "14:49", "15:12", "15:40", "16:18", "16:29", "16:44", "16:56", "17:20", "17:08", "17:29", "17:44", "17:56", "18:20", "6:08", "6:29", "6:44", "6:56", "7:11", "7:22", "8:04", "9:04", "10:04", "11:04"),
            Arrays.asList("5:05", "5:40", null, "6:42", null, "6:48", null, null, "7:42", null, "7:48", null, null, "8:45", null, "8:51", "9:21", "9:52", "10:27", "10:52", "11:45", "12:45", "13:45", "14:52", "15:15", "15:43", "16:21", null, "16:48", "16:59", "17:23", null, null, "17:48", "17:59", "18:23", null, null, "6:48", "6:59", "7:14", "7:25", "8:07", "9:07", "10:07", "11:07"),
            Arrays.asList("5:10", "5:45", null, "6:48", "6:33", "6:54", null, null, "7:48", "7:33", "7:54", null, null, "8:51", "8:35", "8:57", "9:27", "9:58", "10:32", "10:58", "11:51", "12:51", "13:51", "14:58", "15:20", "15:48", "16:27", "16:37", "16:54", null, "17:29", null, "17:37", "17:54", null, "18:29", null, "6:37", "6:54", null, "7:20", "7:30", "8:12", "9:12", "10:12", "11:12"),
            Arrays.asList("5:14", "5:49", null, null, null, "6:58", null, "7:27", null, null, "7:58", null, "8:27", null, null, "9:01", "9:31", "10:02", "10:36", "11:02", "11:55", "12:55", "13:55", "15:02", "15:24", "15:52", "16:31", "16:41", null, "17:06", "17:33", null, "17:41", null, "18:06", "18:33", null, "6:41", null, "7:06", "7:24", "7:34", "8:16", "9:16", "10:16", "11:16"),
            Arrays.asList("5:17", "5:52", null, null, null, "7:02", null, null, null, null, "8:01", null, null, null, null, "9:05", "9:34", "10:05", "10:39", "11:05", "11:58", "12:58", "13:58", "15:05", "15:27", "15:55", null, "16:45", null, null, null, null, "17:45", null, null, null, null, "6:45", null, null, null, "7:37", "8:20", "9:20", "10:20", "11:20"),
            Arrays.asList("5:20", "5:55", "6:19", "6:54", null, "7:05", "7:19", "7:33", "7:54", null, "8:05", "8:19", "8:33", "8:59", null, "9:08", "9:38", "10:08", "10:42", "11:08", "12:02", "13:02", "14:02", "15:08", "15:30", "15:58", null, "16:49", null, "17:10", null, "17:19", "17:49", null, "18:10", null, "6:19", "6:49", null, "7:10", "7:29", "7:40", "8:23", "9:23", "10:23", "11:23"),
            Arrays.asList("5:23", "5:58", null, null, null, "7:09", null, null, null, null, "8:08", null, null, null, null, "9:12", null, "10:11", null, "11:11", "12:05", "13:05", "14:05", "15:11", null, "16:01", null, "16:52", null, null, null, null, "17:52", null, null, null, null, "6:52", null, null, null, "7:43", "8:26", "9:26", "10:26", "11:26"),
            Arrays.asList("5:26", "6:01", null, null, "6:42", "7:12", null, "7:38", null, "7:42", "8:11", null, "8:38", null, "8:44", "9:15", "9:42", "10:15", "10:47", "11:15", "12:08", "13:08", "14:08", "15:15", "15:34", "16:04", "16:38", "16:55", null, "17:14", "17:40", null, "17:55", null, "18:14", "18:40", null, "6:55", null, "7:14", "7:33", "7:46", "8:29", "9:29", "10:29", "11:29"),
            Arrays.asList("5:30", "6:05", null, null, null, "7:16", null, "7:42", null, null, "8:15", null, "8:42", null, null, "9:19", "9:46", "10:18", "10:51", "11:18", "12:12", "13:12", "14:12", "15:18", "15:38", "16:08", null, "15:59", null, "17:18", null, null, "17:59", null, "18:18", null, null, "6:59", null, "7:18", "7:37", "7:50", "8:33", "9:33", "10:33", "11:33"),
            Arrays.asList("5:35", "6:10", "6:29", "7:03", "6:50", "7:21", "7:29", null, "8:03", "7:50", "8:21", "8:29", null, "9:08", "8:52", "9:24", "9:51", "10:23", "10:56", "11:23", "12:17", "13:17", "14:17", "15:23", "15:43", "16:13", "16:46", "17:04", "17:09", null, "17:48", "17:29", "18:04", "18:09", null, "18:48", "6:29", "7:04", "7:09", null, "7:43", "7:55", "8:38", "9:38", "10:38", "11:38"),
            Arrays.asList("5:39", "6:14", null, null, null, "7:25", null, "7:48", null, null, "8:25", null, "8:48", null, null, "9:29", "9:55", "10:27", "11:00", "11:27", "12:21", "13:21", "14:21", "15:27", "15:47", "16:17", null, "17:08", null, "17:25", null, null, "18:08", null, "18:25", null, null, "7:08", null, "7:25", null, "7:59", "8:42", "9:42", "10:42", "11:42"),
            Arrays.asList("5:43", "6:18", null, "7:09", null, "7:29", null, null, "8:09", null, "8:29", null, null, "9:14", null, "9:32", null, "10:31", null, "11:31", "12:25", "13:25", "14:25", "15:31", null, "16:21", null, "17:13", null, null, null, null, "18:13", null, null, null, null, "7:13", null, null, null, "8:03", "8:46", "9:46", "10:46", "11:46"),
            Arrays.asList("5:49", "6:24", null, null, null, "7:37", null, null, null, null, "8:37", null, null, null, null, "9:38", null, "10:37", null, "11:37", "12:31", "13:31", "14:31", "15:37", null, "16:27", null, "17:19", null, null, null, null, "18:19", null, null, null, null, "7:19", null, null, null, "8:09", "8:52", "9:52", "10:52", "11:52"),
            Arrays.asList("5:54", "6:29", null, null, null, "7:44", null, null, null, null, "8:44", null, null, null, null, "9:44", null, "10:43", null, "11:43", "12:37", "13:37", "14:37", "15:43", null, "16:32", "16:58", "17:25", "17:21", "17:35", "18:00", "17:43", "18:25", "18:21", "18:35", "19:00", "6:43", "7:25", "7:21", "7:35", "7:55", "8:14", "8:57", "9:57", "10:57", "11:57"),
            Arrays.asList("6:03", "6:38", "6:47", "7:22", "7:07", "7:51", "7:47", "8:03", "8:22", "8:07", "8:51", "8:47", "9:03", "9:27", "9:09", "9:50", "10:09", "10:50", "11:15", "11:50", "12:43", "13:43", "14:43", "15:50", "15:04", "16:40", "17:06", "17:32", "17:27", "17:43", "18:06", "17:49", "18:33", "18:27", "18:43", "19:06", "6:49", "7:32", "7:27", "7:43", "8:02", "8:23", "9:04", "10:04", "11:04", "12:04")
    );
}
