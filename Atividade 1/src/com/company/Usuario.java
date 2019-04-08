package com.company;

public class Usuario {
    private String nome;
    private String email;
    private String CPF;
    private String nascimento;
    private Carteira carteira;


    public Usuario (String nome,String email, String CPF, String nascimento, Carteira carteira){
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.nascimento = nascimento;
        this.carteira = carteira;
    }

    public String getDados(){
        return "Nome: " + getNome() + " Email: " + getEmail() + " CPF: " + getCPF() + "\n\tCarteira:" + this.carteira.getDadosCarteira() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNascimento() {
        return nascimento;
    }

    public Carteira getCarteira(){
        return carteira;
    }
}
