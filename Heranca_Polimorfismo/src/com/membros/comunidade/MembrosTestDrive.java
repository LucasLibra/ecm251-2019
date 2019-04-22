package com.membros.comunidade;

public class MembrosTestDrive {
    public static void ExibirDados(MembrosDaComunidade m){
        System.out.println(m.getDados());
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", "483.647.698-47", "17.01165-5");
        Graduado g1 = new Graduado("Bruno", "300.231.467-92", "Engenharia Civil");
        Funcionarios f1 = new Funcionarios("Roberto", "200.231.123-45", "RH", 2500);
        Professor p1 = new Professor("Murilo", "123.456.178-23", 7500, "Linguagens de Programação");
        Empregado e1 = new Empregado("Rafael","102.567.295-23",6000);
        ExibirDados(a1);
        ExibirDados(g1);
        ExibirDados(f1);
        ExibirDados(p1);
        ExibirDados(e1);
    }
}
