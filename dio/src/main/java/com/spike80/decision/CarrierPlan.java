package com.spike80.decision;

public class CarrierPlan {
    public static void main(String[] args) {
        char plan = 'g';//B, T
        String note = "100 min de ligaçoes\n";
        switch(plan){
            case 'M':{
                System.out.println(note.concat("5G de YouTube!"));
                break;
            }
            case 'B':{
                System.out.println(note);
                break;
            }
            case 'T':{
                System.out.println(note.concat("Whats e Insta grátis!"));
            }
            default:{
                System.out.println("Undefined! :(");
            }
                
        }
        
    }
    
}
