package com.coderbd.remoteShutDown;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ShutDown extends Remote{
    public void shutdown() throws RemoteException; 
}
