package com.spike80.methods;

public class SmartTV {
    
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void powerOn(){
        on = true;
    }

    public void powerOff(){
        on = false;
    }

    public void volumeUP(){
        volume++;
    }

    public void volumeDOWN(){
        volume--;
    }

    public void changeChannel(int channel){
        this.channel = channel;
    }

    public void channelUP(){
        channel++;
    }

    public void channelDOWN(){
        channel--;
    }
}
