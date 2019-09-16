package com.company.app;

import com.company.model.AnimaisDAO;
import com.company.model.Animal;

import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private Scanner scanner;
    private List<Animal> animais;
    private Animal animal;

    private void menu(){
        System.out.println("1 - Já cadastrados");
        System.out.println("2 - Pesquisar");
        System.out.println("3 - Inserir");
        System.out.println("4- Atualizar");
        System.out.println("5- Deletar");
        System.out.println("0 - Sair");
    }
    public Aplicacao(){
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean continuar = true;
        do{
            menu();
            int op = scanner.nextInt();
            switch(op) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    animais = AnimaisDAO.getInstance().getAll();
                    for (Animal a : animais) {
                        System.out.print("ID: " + a.getId());
                        System.out.println(" Nome: " + a.nome);
                        System.out.println(" Lon: " + a.lon);
                        System.out.println(" Lat: " + a.lat);
                        System.out.println(" Altura: " + a.altura);
                        System.out.println(" Peso: " + a.peso);
                        System.out.println(" Tipo: " + a.tipo);

                    }
                    break;
                case 2:
                    System.out.println("Informe o nome: ");
                    String nome = scanner.nextLine();
                    Animal animal = AnimaisDAO.getInstance().getAnimal(nome);
                    if (animal == null) {
                        System.out.println("Animal não cadastrado");
                    } else {
                        System.out.print("ID: " + animal.getId());
                        System.out.println(" Nome: " + animal.nome);
                        System.out.println(" Lat: " + animal.lat);
                        System.out.println(" Lon: " + animal.lon);
                        System.out.println(" Altura: " + animal.altura);
                        System.out.println(" Peso: " + animal.peso);
                        System.out.println(" Tipo: " + animal.tipo);
                    }
                case 3:
                    String tipo;
                    double lat, lon, altura, peso;

                    System.out.println("Informe:");
                    System.out.println("Nome: ");
                    nome = scanner.next();
                    System.out.println("Lat: ");
                    lat = scanner.nextDouble();
                    System.out.println("Lon: ");
                    lon = scanner.nextDouble();
                    System.out.println("Altura: ");
                    altura = scanner.nextDouble();
                    System.out.println("Peso: ");
                    peso = scanner.nextDouble();
                    System.out.println("Tipo: ");
                    tipo = scanner.next();

                    animal = new Animal(nome, tipo, lat, lon, altura, peso);
                    AnimaisDAO.getInstance().insertAnimal(animal);
                    break;
                case 4:
                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    animal = AnimaisDAO.getInstance().getAnimal(nome);
                    if (animal == null)
                        System.out.println("Animla não cadastrado");
                    else {
                        System.out.print("ID: " + animal.getId());
                        System.out.println(" Nome: " + animal.nome);
                        System.out.println(" Lat: " + animal.lat);
                        System.out.println(" Lon: " + animal.lon);
                        System.out.println(" Altura: " + animal.altura);
                        System.out.println(" Peso: " + animal.peso);
                        System.out.println(" Tipo: " + animal.tipo);
                        System.out.println("Qual campo atualizar? ");
                        System.out.println("1 - NOME");
                        System.out.println("2 - LAT");
                        System.out.println("3 - LON");
                        System.out.println("4 - ALTURA");
                        System.out.println("5 - PESO");
                        System.out.println("6 - TIPO");
                        op = scanner.nextInt();
                        System.out.println("Novo Valor:");
                        switch (op) {
                            case 1:
                                String temp = scanner.next();
                                animal.nome = temp;
                                break;
                            case 2:
                                double temp2 = scanner.nextDouble();
                                animal.lat = temp2;
                                break;
                            case 3:
                                temp2 = scanner.nextDouble();
                                animal.lon = temp2;
                                break;
                            case 4:
                                temp2 = scanner.nextDouble();
                                animal.altura = temp2;
                                break;
                            case 5:
                                temp2 = scanner.nextDouble();
                                animal.peso = temp2;
                                break;
                            case 6:
                                temp = scanner.next();
                                animal.tipo = temp;
                                break;
                        }
                        if (AnimaisDAO.getInstance().updateAnimal(animal))
                            System.out.println("Atualizado com Sucesso");
                        else
                            System.out.println("Falha na atualização");
                    }
                    break;
                case 5:
                    System.out.println("Informe o nome: ");
                    nome = scanner.next();
                    AnimaisDAO.getInstance().deleteAnimal(nome);
                    break;

            }
        } while (continuar);
    }
}
