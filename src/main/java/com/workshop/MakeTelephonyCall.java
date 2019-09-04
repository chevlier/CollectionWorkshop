package com.workshop;


public class MakeTelephonyCall extends LineHandler {

    TelephonyCall myCall = new TelephonyCall();

    public void call (){
        if(isLineAvailable()){
        myCall.setCallStatus(true);
        System.out.print("Dzwonie");
        }
        else
            System.out.print("Brak polaczenia");
}
}
