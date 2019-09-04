package com.workshop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LineHandlerTest {
    TelephonyCall myTestCall = new TelephonyCall();
    LineHandler tesltLine = new LineHandler();

    @Test
    public void testIsLineSynchronized(){
        myTestCall.setChannelId(3);
        myTestCall.setLineId(2);
        assertEquals(false, (tesltLine.isLineSynchronized()));
    }
}


