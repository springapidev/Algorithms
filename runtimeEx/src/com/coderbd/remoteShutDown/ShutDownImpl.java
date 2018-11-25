package com.coderbd.remoteShutDown;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ShutDownImpl extends UnicastRemoteObject implements ShutDown{

    public ShutDownImpl()  {
    }

    @Override
    public void shutdown() throws RemoteException {
        try {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec("shutdown -l");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
