package com.company;

public class Teste {
    public static void main(String[] args) {
        /*Animal a = new Lobo();
        Animal b = new Peixe();

        a.comer();
        b.comer();
        a.reproduzir();
        b.reproduzir();*/
        Animal[] animals = new Animal[3];
        animals[0] = new Lobo();
        animals[0].comer();
        //animals[1].comer(); //Dá justa causa, não fazer!
        //animals[4].comer(); //Out of bounds
        animals[1] = new Lobo();
        animals[2] = new Lobo();
        /*for(int i = 0; i < animals.length; i++){
            animals[i].comer();
        }*/
        for(Animal animal : animals){
            animal.comer();
        }

    }

}
