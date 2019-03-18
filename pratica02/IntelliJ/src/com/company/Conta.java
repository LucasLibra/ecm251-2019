package com.company;

public class Conta {
    int numero;
    String titular;
    double saldo;
    String cpf;

    public void visualizarSaldo(){
        System.out.println("Conta: " + numero + " Saldo: " + saldo);
    }
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        visualizarSaldo();
    }
    public void sacar(double valorSaque){
        saldo -= valorSaque;
        visualizarSaldo();
    }
    public void transferirDinheiro(double valor, Conta beneficiado){
        sacar(valor);
        beneficiado.depositar(valor);
    }

}
