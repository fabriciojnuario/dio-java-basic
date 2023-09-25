package com.spike80.repetion;

public class ForExampleArray {
    public static void main(String[] args) {
        String study [] = {"Fabrício", "Januário", "Ferreira"};

        for(int i=0;i<study.length;i++){
            System.out.println("The index' study = ".concat(String.valueOf(i)).concat(String.valueOf(study[i])));
        }

        for (String str : study) {
            System.out.println(str);
            
        }
    }
}
