package com.workshop;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {


    public static void main(String[] args) {
    List<Object> objectList = new ArrayList<Object>();
    objectList.add(NetworkIndicator.class);
        objectList.add(ConnectionHandler.class);
        objectList.add(RoutingSourceListener.class);
        objectList.add(TelephonyRouter.class);


        boolean removalStatus = objectList.remove(RoutingSourceListener.class);
        System.out.print(removalStatus + "\t");

        removalStatus = objectList.remove(RoutingSourceListener.class);
        System.out.print(removalStatus);
    }

}
