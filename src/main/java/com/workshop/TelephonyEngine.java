package com.workshop;



public class TelephonyEngine {

    private int telephonyChannel = 560;

    TelephonyCall myCall = new TelephonyCall();

    public void addTelephonyChannel() {
        myCall.setChannelId(telephonyChannel);
    }

    public boolean checkChannelAvailability(){
        addTelephonyChannel();
        if (myCall.getChannelId()%2 ==0){
            return true;}
        else {
            return false;}
    }
}
