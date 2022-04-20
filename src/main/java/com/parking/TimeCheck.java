package com.parking;

public class TimeCheck {

    public boolean validTime(int hour, int mins){
        return (hour>=0 && hour<24) && (mins>=0 && mins<60);
        // TODO: Make unit test
    }

    public int getMinutes(int hStart, int mStart, int hEnd, int mEnd){
        return (mEnd - mStart) + (hEnd - hStart) * 60;
        // TODO: Make unit test
    }
}
