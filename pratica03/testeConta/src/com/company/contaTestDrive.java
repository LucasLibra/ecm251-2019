package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class contaTestDrive {
    public static void main(String[] args) {
        Conta c1; //Declara um objeto do tipo Conta.
        c1 = new Conta(0,"All Might");
        c1.depositar(1000);
        c1.sacar(300);
        c1.depositar(1000);
        Conta c2;
        c2 = new Conta(1,"Deku",500);
        Conta c3;
        c3 = new Conta(2,"Kazu", -800);
        c1.exibirDetalhes();
        c2.exibirDetalhes();
        c3.exibirDetalhes();
    }


}
