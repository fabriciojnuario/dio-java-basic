package com.spike80.decision;

public class Grades2Valuate {
    public static void main(String[] args) {
        int grade = 6;
        String result = grade>=7 ? "Aprovado" : grade<7 && grade>=5 ? "Recuperação" : "Reprovado";
        System.out.println(result);
    }
}
