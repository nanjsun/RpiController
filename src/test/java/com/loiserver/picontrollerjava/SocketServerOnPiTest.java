package com.loiserver.picontrollerjava;

import com.loiserver.picontrollerjava.model.SocketServerOnPi;
import org.junit.Test;

public class SocketServerOnPiTest {
    private SocketServerOnPi socketServerOnPi;

    @Test
    public void test() throws Exception {
        try{
            socketServerOnPi = new SocketServerOnPi();
            System.out.println("listening on 9899");

            socketServerOnPi.listen();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
