package com.company;

import java.util.Scanner;

public class Actividad3 {

    //programa para mostrar por consola x cantidad de numeros primos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n;
        System.out.println("ingrese un numero hasta 7: ");
        n = scanner.nextInt();

        imprimirNumerosPrimos(n);
    }
    public static void imprimirNumerosPrimos(Integer n){
        Integer np1 = 2;
        Integer np2 = 3;
        Integer np3 = 5;
        Integer np4 = 7;
        Integer np5 = 11;
        Integer np6 = 13;
        Integer np7 = 17;

        if (n.equals(1)){
            System.out.println("el numero primo "+ n + " es: "+np1);
        }
        else if (n.equals(2)){
            System.out.println("los primeros "+ n + " numeros primos son: "+np1+", "+np2);
        }
        else if (n.equals(3)){
            System.out.println("los primeros "+ n + " numeros primos son: "+np1+", "+np2+", "+np3);
        }
        else if (n.equals(4)){
            System.out.println("los primeros "+ n + " numeros primos son: "+np1+", "+np2+", "+np3+", "+np4);
        }
        else if (n.equals(5)){
            System.out.println("los primeros "+ n + " numeros primos son: "+np1+", "+np2+", "+np3+", "+np4+", "+np5);
        }
        else if (n.equals(6)){
            System.out.println("los primeros "+ n + " numeros primos son: "+np1+", "+np2+", "+np3+", "+np4+", "+np5+", "+np6);
        }
        else if (n.equals(7)){
            System.out.println("los primeros "+ n + " numeros primos son: "+np1+", "+np2+", "+np3+", "+np4+", "+np5+", "+np6+", "+np7);
        }
        else {
            System.out.println("ingrese un numero valido");
        }
    }

}
