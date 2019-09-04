package com.workshop;


public class TelephonyNetworkDispatcher extends TelephonyEngine{

    private String networkId = "TM";

    TelephonyCall myCall = new TelephonyCall();

    public void addNetworkIdentificator(){
        myCall.setNetwork(networkId);
    }

    public boolean networkAvailability(){
        if(myCall.getNetwork() != "DD"){
            return true;
        }
        else return false;
    }

    public boolean withNetworkAssociated(){
        addNetworkIdentificator();
        if( networkAvailability() && checkChannelAvailability()){
        return true;
    }
    else
        return false;
    }

}
