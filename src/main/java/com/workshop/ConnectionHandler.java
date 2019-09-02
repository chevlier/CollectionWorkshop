package com.workshop;


public class ConnectionHandler extends TelephonyRouter {

    int phoneLineID = 45;

    public void choosePhoneLine(int lineId){
        makeCall(lineId);
        lineId = 123;
    }

    public boolean isLineSynchronized(int lineId){
        return true;
    }

}
