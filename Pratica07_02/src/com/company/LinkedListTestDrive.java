package com.company;

import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Item> lista = new LinkedList<Item>();
        lista.add(new Item(1,"Xbox One"));
        lista.add(0, new Item(2,"Switch"));
        lista.add(new Item(3,"PS4"));
        for(Item i : lista){
            System.out.println("Item - " + i);
        }
        System.out.println("Tamanho:" + lista.size());
    }
}
