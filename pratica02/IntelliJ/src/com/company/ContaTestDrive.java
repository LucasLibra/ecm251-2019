package com.company;

public class ContaTestDrive {
    public static void main(String[] args) {
        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();
        c1.numero = 1;
        c2.numero = 2;
        c1.depositar(500.0);
        c2.depositar(2000);
        c1.sacar(200);
        c2.sacar(500);
        c1.transferirDinheiro(100,c2);
    }
}
