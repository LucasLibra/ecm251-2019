package com.company;

public class Carteira {
    private int idCarteira;
    private String nomeCarteira;
    private String senhaAcesso;
    private Cartao cartaoDebito;
    private Cartao cartaoCredito;

    public String getDadosCarteira(){
        if(this.cartaoCredito == null)
            return "\tId Carteira: " + getIdCarteira() + "\n\t\t Cartão de Debito: " + this.cartaoDebito.getDadosCartao();
        if(this.cartaoDebito == null)
            return "\tId Carteira: " + getIdCarteira() + "\n\t\t Cartão de Crédito: " + this.cartaoCredito.getDadosCartao();
        else
            return "\tId Carteira: " + getIdCarteira() + "\n\t\t Cartão de Debito: " + this.cartaoDebito.getDadosCartao() + "\n\t\t Cartão de Crédito: " + this.cartaoCredito.getDadosCartao();
    }

    public Carteira(int idCarteira,String nomeCarteira,String senhaAcesso,Cartao cartaoDebito, Cartao cartaoCredito){
        this.idCarteira = idCarteira;
        this.nomeCarteira = nomeCarteira;
        this.senhaAcesso = senhaAcesso;
        this.cartaoDebito = cartaoDebito;
        this.cartaoCredito = cartaoCredito;
    }

    public int getIdCarteira() {
        return idCarteira;
    }

    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public Cartao getCartaoDebito(){
        return cartaoDebito;
    }

    public Cartao getCartaoCredito(){
        return cartaoCredito;
    }
    public String pagamento(Cartao d1, int senha){ //Utilizamos o método Pagamento na Carteira pois o usuário possui os cartões dentro dela
        if(d1.getSenha() == (senha)){
            //System.out.println(d1.getDadosCartao());
            return "Transação Aprovada P/ o Cartão: " + d1.getDadosCartao() + " Tipo: " + d1.getTipo();
        } else
            return "Transação Recusada P/ o Cartão: " + d1.getDadosCartao() + " Tipo: " + d1.getTipo();
    }


}
