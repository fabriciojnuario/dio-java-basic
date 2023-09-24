package com.spike80.io;

import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: \n");
        String name = scanner.next();

        System.out.println("Digite seu sobrenome: \n");
        String last_name = scanner.next();

        System.out.println("Digite sua idade: \n");
        int age = scanner.nextInt();  
        
        System.out.println("Digite sua altura: \n");
        double alt = scanner.nextDouble();

        System.out.println("Hi, my name is: ".concat(name).concat(" ").concat(last_name));
        System.out.println("My age is: ".concat(String.valueOf(age)));
        System.out.println("My height is: ".concat(String.valueOf(alt)));

    }
}
