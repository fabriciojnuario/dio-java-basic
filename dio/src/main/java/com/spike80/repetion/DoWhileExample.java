package com.spike80.repetion;
import java.util.Random;
public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Calling...\n");
        do{
            System.out.println("Ringing...\n");
        }while(PickUp());
        System.out.println("\nHi, is there anybody out there?");
    }

    private static boolean PickUp(){
        boolean pick_up = new Random().nextInt(3)==1;
        System.out.println("Did pick up? "+pick_up);
        return !pick_up;
    }
}
