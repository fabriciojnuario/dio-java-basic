package com.spike80.repetion;

public class BreakContinueExample {
    public static void main(String[] args) {
        for (int num=1; num<=5; num++){
            if(num==3) break;
            System.out.println(num);
        }
        System.out.println("\n___________\n");
        for (int num=1; num<=5; num++){
            if(num==3) continue;
            System.out.println(num);
        
        }  
    }
}
