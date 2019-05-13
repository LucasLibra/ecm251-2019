package com.company;

public class Cuidado {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e){
            System.out.println("Exceção: " + e);
        }
        System.out.println("Frase Original: " + frase);
        System.out.println("Nova Frase: " + novaFrase);
    }
}
