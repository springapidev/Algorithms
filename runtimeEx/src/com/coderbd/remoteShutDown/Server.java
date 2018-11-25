package com.coderbd.remoteShutDown;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static void main(String arg[]) {
        try {
            ShutDown implx = new ShutDownImpl();
            System.out.println("Initialising server.........");
            Naming.rebind("arefin", implx);
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Registered");
    }
}
