package com.coderbd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;

public class ShutDownRemotePc {

    public static void main(String[] args) {

     
           
            System.out.println("Host Name : " + getSystemName());
            System.out.println("Host IP   : " + getIPAddress());
            System.out.println("Host Address : " + getMAC());
       
    }

   

    public static void shutDownPc() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
        long a = Long.parseLong(br.readLine());
        Process proc = runtime.exec("shutdown -s -t " + a);
        System.exit(0);
    }

    /**
     * Method for get System Name
     *
     * @return Host name
     */
    private static String getSystemName() {
        try {
            InetAddress inetaddress = InetAddress.getLocalHost(); //Get LocalHost refrence
            String name = inetaddress.getHostName();   //Get Host Name
            return name;   //return Host Name
        } catch (Exception E) {
            E.printStackTrace();  //print Exception StackTrace
            return null;
        }
    }

    /**
     * method to get Host IP
     *
     * @return Host IP Address
     */
    private static String getIPAddress() {
        try {
            InetAddress inetaddress = InetAddress.getLocalHost();  //Get LocalHost refrence
            String ip = inetaddress.getHostAddress();  // Get Host IP Address
            return ip;   // return IP Address
        } catch (Exception E) {
            E.printStackTrace();  //print Exception StackTrace
            return null;
        }

    }

    /**
     * method to get Host Mac Address
     *
     * @return Mac Address
     */
    private static String getMAC() {
        try {
            InetAddress inetaddress = InetAddress.getLocalHost(); //Get LocalHost refrence

            //get Network interface Refrence by InetAddress Refrence
            NetworkInterface network = NetworkInterface.getByInetAddress(inetaddress);
            byte[] macArray = network.getHardwareAddress();  //get Harware address Array
            StringBuilder str = new StringBuilder();

            // Convert Array to String 
            for (int i = 0; i < macArray.length; i++) {
                str.append(String.format("%02X%s", macArray[i], (i < macArray.length - 1) ? "-" : ""));
            }
            String macAddress = str.toString();

            return macAddress; //return MAc Address
        } catch (Exception E) {
            E.printStackTrace();  //print Exception StackTrace
            return null;
        }
    }
}
