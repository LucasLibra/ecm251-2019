package com.company.model;

public class Animal {
    public String nome, tipo;
    private int id;
    public double lat, lon, altura, peso;

    public Animal(){
        id = -1;
    }

    public Animal(int id){
        this.id = id;
    }

    public Animal(String nome, String tipo, double lat, double lon, double altura, double peso){
        this.nome = nome;
        this.tipo = tipo;
        this.lat = lat;
        this.lon = lon;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId(){
        return id;
    }
}
