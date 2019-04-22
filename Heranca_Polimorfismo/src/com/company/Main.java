package com.company;

public class Main {

    public static void main(String[] args) {
	    Gerente g1 = new Gerente("Gervásio",123456);
	    g1.setSalario(10000.0);
	    Diretor d1 = new Diretor("Lucas");
	    d1.setSalario(20000.0);
	    Vendedor v1 = new Vendedor("Thiago");
	    v1.setSalario(2000.0);
	    Engenheiro e1 = new Engenheiro("Roberto");
	    e1.setSalario(5000.0);
        System.out.println("Gerente: " + g1.comissao());
        System.out.println("Diretor: " + d1.comissao());
        System.out.println("Vendedor: " + v1.comissao());
        System.out.println("Engenheiro: " + e1.comissao());
		RH rh = new RH();
		rh.adicionaComissao(g1);
		rh.adicionaComissao(e1);
		System.out.println("Total: " + rh.getTotalComissao());
    }
}
