package com.coderbd.remoteShutDown;

import java.rmi.*;

public class Client {

    public static void main(String args[]) throws Exception {
        String url = "rmi://172.16.185.61/arefin";
        ShutDown shut = (ShutDown) Naming.lookup(url);
        shut.shutdown();
    }
}
