package com.google;

public class Ass5 {
    public static void main(String[] args) {

        int trainLength=340;//340 m long train
        double speed=45.0;//45 km/hr speed of train
        int tunnel=160; //160m long tunnel

        /*
        * 45 km/hr= 45* 1000/3600 m/s
        * Speed= 25/2 m/s
        * Total distance to cover (340+160)m= 500m
        * time = distance/speed   
        *        500*(2/25)
        *        40 seconds
        * */

        speed=(double) speed*(1000/3600.0);
        int distance=tunnel+trainLength;
        double time=distance/speed;

        System.out.println(" Time required :"+ time+" Seconds");





    }
}
