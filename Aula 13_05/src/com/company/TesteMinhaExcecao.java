package com.company;

public class TesteMinhaExcecao {
    public static void main(String[] args) {
        String frase = "PC Gaming Master Race";
        try {
            testaFrase(frase);
        } catch (SemLetraException e) {
            System.out.println(e);
            //e.printStackTrace();
        }
        System.out.println(frase);
    }

    private static void testaFrase(String frase) throws SemLetraException {
        if(!frase.toUpperCase().contains("B"))
            throw new SemLetraException();
    }
}
