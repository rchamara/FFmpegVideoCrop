package com.livewallrcandrapp.ffmpegvideocrop;

import android.util.Log;

public class TimeUtil {

    private static final String  TAG = "TimeUtil";

    public static String getTimeFormat(long timeInMilli) {
        Log.i(TAG,String.valueOf(timeInMilli));
        if (timeInMilli == 0) return "ERROR";
        float second = (float) (timeInMilli/1000) % 60;
        int minutes  = (int)   ((timeInMilli/(1000*60)) % 60);
        int hours    = (int)   ((timeInMilli/(1000*60*60)) %24);

        String hoursInString = "00";
        if (hours == 0) hoursInString = "00";
        if (hours < 10) hoursInString = "0"+hours;
        if (hours > 9 ) hoursInString = String.valueOf(hours);
        Log.i(TAG, "Hours: "+hoursInString);

        String minutesInString = "00";
        if (minutes == 0) minutesInString = "00";
        if (minutes < 10) minutesInString = "0"+minutes;
        if (minutes > 9 ) minutesInString = String.valueOf(minutes);
        Log.i(TAG,"Minutes: "+minutesInString );

        String secondInString = "00";
        if (second == 0) secondInString = "00";
        if (second < 10) secondInString = "0"+second;
        if (second > 9 ) secondInString = String.valueOf(second);
        Log.i(TAG,"Second: "+secondInString);

        String time = hoursInString+":"+minutesInString+":"+secondInString;
        Log.i(TAG, "Format Time: " +time);
        return time;
    }

}
