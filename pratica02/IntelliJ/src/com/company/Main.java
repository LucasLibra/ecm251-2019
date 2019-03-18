package com.company;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {
	    Sayajin s1; //object declaration
        s1 = new Sayajin();
        s1.nome = "Vegeta";
        Sayajin s2 = new Sayajin();
        s2.nome = "Brolly";
//        System.out.println(s1.nome);
//        System.out.println(s2.nome);
        int i;
        s1.ki = 1000.;
        s2.ki = 1000000.;
        s1.odio = false;
        s2.odio = true;
        for(i=0;i<10;++i) {
            System.out.println(s1.nome);
            s1.treinar();
            System.out.println(s2.nome);
            s2.treinar();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
