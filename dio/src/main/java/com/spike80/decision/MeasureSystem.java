package com.spike80.decision;

public class MeasureSystem {
    public static void main(String[] args) {
        char size = 'M';
        switch(size){
            case 'P':{
                System.out.println("Small");
                break;
            }
            case 'M':{
                System.out.println("Medio");
                break;
            }
            case 'G':{
                System.out.println("Big");
                break;
            }
            default:{
                System.out.println("Undefined");
            }
        }
    }
}
