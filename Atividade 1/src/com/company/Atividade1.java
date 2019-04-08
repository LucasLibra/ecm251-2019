package com.company;

public class Atividade1 {
    public static void main(String[] args) {
        Cartao d1 = new Cartao(0,"Santander","Lucas N Libório","Débito","02/19","05/27",364,1234,78789797,1);
        Cartao d2 = new Cartao(1,"Santander","Guilher K Tabacow","Débito","03/17","07/25",329,4321,12323232,2);
        Cartao d3 = new Cartao(2,"Santander","Guilher K Tabacow","Crédito","07/18","01/26",123,4870,121234354,2);

        Carteira c1 = new Carteira(0,"Carteira do Lucas","lucas123",d1,null);
        Carteira c2 = new Carteira(1,"Carteira do Gui","gui123",d2,d3);

        Usuario u1 = new Usuario("Lucas Libório","lucasne.liborio@gmail.com","483.647.698-47","01/05/1999",c1);
        Usuario u2 = new Usuario("Guilherme Tabacow","guilhermetabacow@gmail.com","436.203.728-45","15/06/1998",c2);

        System.out.println("Usuário: \n" + u1.getDados());
        System.out.println("Usuário: \n" + u2.getDados());

        System.out.println(c1.pagamento(d1,1234));
        System.out.println(c2.pagamento(d2,4321));
        System.out.println(c2.pagamento(d3,4870));
    }


}

