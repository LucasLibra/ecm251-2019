package com.membros.comunidade;

public class MembrosDaComunidade {
    protected String nome;
    protected String CPF;

    public MembrosDaComunidade(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getDados(){
      return this.nome + '\t' + this.CPF;
    }
}