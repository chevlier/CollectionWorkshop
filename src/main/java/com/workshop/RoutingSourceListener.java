package com.workshop;

public class RoutingSourceListener extends TelephonyRouter {

    public String connectToCellArea()
    {
        makeCall(234);
        return "Connected";
    }
}
