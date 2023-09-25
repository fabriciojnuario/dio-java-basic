package com.spike80.io;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Type your name: ");
            String name = sc.nextLine();
            System.out.println("Type your last name: ");
            String last_name = sc.next();
            System.out.println("What's your age?");
            int age = sc.nextInt();
            System.out.println("What's your height?");
            double alt = sc.nextDouble();

            System.out.println("Hi, my name is: ".concat(name).concat(" ").concat(last_name));
            System.out.println("My age is: ".concat(String.valueOf(age)));
            System.out.println("My height is: ".concat(String.valueOf(alt)));
            sc.close();
        }catch(InputMismatchException e){
            System.out.println("\nInsert correct format data _age,_height " + e);
        }
    }
}
