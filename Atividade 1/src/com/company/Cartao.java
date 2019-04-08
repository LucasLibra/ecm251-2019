package com.company;

public class Cartao {
    private double taxaConversaoDolar = 3.9;
    private int idCartao;
    private String label;
    private String emissorCartao;
    private String tipo;
    private String dataEmissao;
    private String validade;
    private int ccv;
    private int senha;
    private int numeroCartao;
    private int numeroConta;

    public String getDadosCartao(){
        return " Id Cartão: " +this.idCartao;
    }

    public Cartao(int idCartao, String label, String emissorCartao, String tipo, String dataEmissao, String validade, int ccv, int senha, int numeroCartao, int numeroConta){
        this.idCartao = idCartao;
        this.label = label;
        this.emissorCartao = emissorCartao;
        this.tipo = tipo;
        this.dataEmissao = dataEmissao;
        this.validade = validade;
        this.ccv = ccv;
        this.senha = senha;
        this.numeroCartao = numeroCartao;
        this.numeroConta = numeroConta;

    }

    public double getTaxaConversaoDolar() {
        return taxaConversaoDolar;
    }


    public int getIdCartao() {
        return idCartao;
    }


    public String getLabel() {
        return label;
    }

    public String getEmissorCartao() {
        return emissorCartao;
    }


    public String getTipo() {
        return tipo;
    }


    public String getDataEmissao() {
        return dataEmissao;
    }


    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public int getSenha() {
        return senha;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

}
