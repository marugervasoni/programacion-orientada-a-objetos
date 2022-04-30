package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in); //creo mi scanner

        System.out.println("nombre perro: "); //pido nombre
        String nombrePerro = scanner.nextLine();

        System.out.println("cuanto alimento requiere: "); //pido cantidad
        Double alimentoRequerido = scanner.nextDouble();



        Integer cantidadPaquetes = cuantosPaquetes(alimentoRequerido); //alamceno en la variable la funcion.
        System.out.println(nombrePerro + "necesita " + cantidadPaquetes + " paquetes"); //para que imprima lo que resultó
    }



    //creo mi metodo
    public static Integer cuantosPaquetes(Double alimentoRequerido){

        Scanner scanner = new Scanner(System.in); //creo scanner en este escope

        Double totalAlimento = 0.0;  //variables de inicio
        Integer cantidadPaquetes = 0;

        while (totalAlimento < alimentoRequerido){ //creo un while para que recorra hasta que se haya satisfecho el perro.
            System.out.println("peso paquete: ");
            Double pesoPaquete = scanner.nextDouble(); //solicito elpeso del paquete x scanner
            totalAlimento = totalAlimento + pesoPaquete;
            cantidadPaquetes++;
        }
        return cantidadPaquetes;

    }
}
