package com.spike80.io;

public class AboutMe {
    public static void main(String[] args) {
        String name = args[0];
        String last_name = args[1];
        int age = Integer.valueOf(args[2]);
        double alt = Double.valueOf(args[3]);

        System.out.println("Hi, my name is: ".concat(name).concat(" ").concat(last_name));
        System.out.println("My age is: ".concat(String.valueOf(age)));
        System.out.println("My height is: ".concat(String.valueOf(alt)));
    }
}
