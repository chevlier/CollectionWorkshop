package com.workshop;


public class NetworkIndicator extends ConnectionHandler {

    char networkName = 'D';

    public int chooseNetwork(int networkId){
        choosePhoneLine(34);
        isLineSynchronized(213);
        makeCall(34534);

        return networkId;
    }

}
