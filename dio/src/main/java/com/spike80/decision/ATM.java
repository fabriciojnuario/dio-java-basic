package com.spike80.decision;

public class ATM {
    public static void main(String[] args) {
        double account_balance = 25.0;
        double withdraw = 30.5;

        if(withdraw<account_balance){
            account_balance = account_balance - withdraw;
            System.out.println("Operation OK! :)");
            System.out.println(account_balance);
        }else{
            System.out.println("OverDraw! :(");
            System.out.println(account_balance);
        }
        
    }

}
