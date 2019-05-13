package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Início do Main");
        metodo1();
        System.out.println("Fim do Main");
    }
    static void metodo1(){
        System.out.println("Início do Método1");
        try{
            metodo2();
        }
        catch (Exception e){
            System.out.println("Exceção pega no Método 1");
            System.out.println(e);
        }
        finally {
            System.out.println("Depois do TryCatch Método 1");
        }
        System.out.println("Fim do Método1");
    }
    static void metodo2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Início do Método2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Algo deu Errado: ");
            throw(e)
                    ;
        }
        finally {
            System.out.println("Depois do TryCatch Método2");
        }
        System.out.println("Fim do Método2");
    }
//        static void metodo2(){
//        System.out.println("Início do Método2");
//        int[] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//            try {
//                array[i] = i;
//            }
//            catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Algo deu Errado: ");
//                System.out.println(e);
//            }
//            System.out.println(i);
//        }
//            System.out.println("Fim do Método2");
//        }
//        static void metodo2(){
//            System.out.println("Início do Método2");
//            int[] array = new int[10];
//            for (int i = 0; i <= 15; i++) {
//                array[i] = i;
//                System.out.println(i);
//            }
//            System.out.println("Fim do Método2");
//        }

}
