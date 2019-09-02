package com.workshop;

public class LineHandler extends TelephonyEngine{

    private boolean isLineAvailable = false;

    private boolean lineSynchronized = false;

    public boolean checkLineAvailability(int channel){
        if(checkChannelAvailability(channel)){
            isLineAvailable = true;
            }
        else{
            isLineAvailable = false;}
        return isLineAvailable;
    }

    public boolean isLineSynchronized(int line){

        if(line%3 == 0){
            return lineSynchronized = true;}
        else
            return  lineSynchronized = false;}

}
