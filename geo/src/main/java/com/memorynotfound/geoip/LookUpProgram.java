package com.memorynotfound.geoip;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LookUpProgram {

    public static void main(String... args) throws UnknownHostException {

        long ipAddress = new BigInteger(InetAddress.getByName("199.212.24.21").getAddress()).longValue();

        System.out.println("By String IP address: \n" +
                GeoIPv4.getLocation("199.212.24.21"));

        System.out.println("By long IP address: \n" +
                GeoIPv4.getLocation(ipAddress));

        System.out.println("By InetAddress IP address: \n" +
                GeoIPv4.getLocation(InetAddress.getByName("72.229.28.185")));

    }
}
