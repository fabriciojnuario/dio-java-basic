package com.spike80.repetion;

import java.util.concurrent.ThreadLocalRandom;;;
public class WhileExample { 
    public static void main(String[] args) {
        double cash = 50;

        System.out.println("\nCash:"+ cash);
        while(cash>0){
            double gum_price = randomValue();
            if(gum_price>cash){
                gum_price = cash;
            }
            System.out.println("Price is ".concat(String.valueOf(gum_price))
                                 .concat(" gum put in it"));
            cash = cash - gum_price;
        }
        System.out.println("Cash: " + cash);
        System.out.println("\nCash off");
    }

    private static double randomValue(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

}
