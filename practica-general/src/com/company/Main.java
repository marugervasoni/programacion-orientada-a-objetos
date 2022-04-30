package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ESTRUCTURAS DE SELECCION

        //1.1. Escribir un programa que solicite un valor entero al usuario y
        // determine si es par o impar.---------------------------------------------------
        Scanner scanner;
        scanner = new Scanner(System.in);

        int numero;
        System.out.println("introduzca un numero entero:");
        numero = scanner.nextInt();

        //if (numero % 2 == 0){
        //System.out.println("el numero ingresado: "+ numero + ", es par.");
        //System.out.println("****--------------------------- fin--------------------------*****");
        //}else{
        //System.out.println("el numero ingresado: "+ numero + ", es impar.");
        //System.out.println("****--------------------------- fin--------------------------*****");
        //}
        //}


        //1.2. Escribir un programa que solicite------------------------------------------
        //un valor entero al usuario y determine si es positivo o negativo.
        if (numero == -numero) {
            System.out.println("el numero: " + numero + ", es negativo");
            System.out.println("****--------------------------- fin--------------------------*****");
        } else {
            System.out.println("el numero: " + numero + ", es positivo");
            System.out.println("****--------------------------- fin--------------------------*****");
        }
    }
}
