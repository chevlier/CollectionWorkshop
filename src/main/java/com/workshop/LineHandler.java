package com.workshop;

public class LineHandler extends TelephonyNetworkDispatcher{

    TelephonyCall myCall = new TelephonyCall();

    private boolean isLineAvailable = false;

    private boolean lineSynchronized = false;

    public void setTelephonyLine(){
        myCall.setLineId(45);
    }


    public boolean isLineAvailable(){

        if(withNetworkAssociated() && isLineSynchronized()){
            isLineAvailable = true;}
        else{
            isLineAvailable = false;}

        return isLineAvailable;
    }

    public boolean isLineSynchronized(){

        if((myCall.getLineId() + myCall.getChannelId())%3 == 0){
            return lineSynchronized = true;}
        else
            return  lineSynchronized = false;}

}
