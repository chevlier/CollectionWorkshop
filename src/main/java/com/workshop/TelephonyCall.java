package com.workshop;

public class TelephonyCall {

    private int channelId = 0;
    private int lineId = 0;
    private String network = "NULL";
    private boolean callStatus = false ;


    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public void setNetwork(String network){
        this.network=network;
    }

    public int getChannelId(){
        return  channelId;
    }

    public int getLineId(){
        return lineId;
    }

    public String getNetwork(){
        return network;
    }

    public void setCallStatus(boolean callStatus){
        this.callStatus=callStatus;
    }

}
