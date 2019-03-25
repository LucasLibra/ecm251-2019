package com.company;

public class cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudarCPF(String cpf){
        if (validarCPF(cpf)){
            this.setCpf(cpf);
        } else {
            System.out.println("Não foi possível atlterar o CPF. ");
        }
    }

    private boolean validarCPF(String cpf){
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
