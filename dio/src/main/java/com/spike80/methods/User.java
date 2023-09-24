package com.spike80.methods;

public class User {
    public static void main(String[] args) {
        
        SmartTV tv = new SmartTV();
        
        System.out.println("on: "+ tv.on);
        System.out.println("channel: " + tv.channel);
        System.out.println("volume: " + tv.volume);

        tv.volumeDOWN();
        tv.volumeDOWN();

        tv.powerOn();
        System.out.println("\non: "+ tv.on);
        tv.powerOff();
        System.out.println("\non: "+ tv.on);
        System.out.println("\non: "+ tv.volume);

        tv.changeChannel(67);

        System.out.println("\non: "+ tv.channel);
        
    }

}

    
