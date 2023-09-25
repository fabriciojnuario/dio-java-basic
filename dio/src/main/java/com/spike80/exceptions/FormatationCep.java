package com.spike80.exceptions;

public class FormatationCep {
    public static void main(String[] args) {
        try {
            String cep = formatCep("2136589283");
            System.out.println(cep);
        } catch (InvalidCepException e) {
            System.out.println("Invalid postal-code!");
            e.printStackTrace();
        }
        
    }

    public static String formatCep(String cep) throws InvalidCepException{
        if(cep.length() != 11){
            throw new InvalidCepException();
        }
        return cep;
    }
}
