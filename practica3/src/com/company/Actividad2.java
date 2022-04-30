package com.company;

import java.util.Scanner;

public class Actividad2 {

    //programa piedra papel o tijera
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //la app solicita el nombre de cada gamer
        String jugador1;
        String jugador2;
        System.out.println("ingrese nombre del jugador 1: ");
        jugador1 = scanner.nextLine();
        System.out.println("ingrese nombre del jugador 2: ");
        jugador2 = scanner.nextLine();

        //invocamos el programa cualGana
        cualGana(jugador1,jugador2);

        }

        //programa cualGana
        static public void cualGana(String jugador1,String jugador2){
         Scanner scanner = new Scanner(System.in);
         String jugadaJugador1 = "";
         String jugadaJugador2 = "";
         String terminar = "*";
         Integer puntosJugador1 = 0;
         Integer puntosJugador2 = 0;

         while (!jugadaJugador1.equals(terminar)){
             System.out.println(jugador1+" ingrese piedra, papel o tijera: ");
             jugadaJugador1 = scanner.nextLine();
             if (!jugadaJugador1.equals(terminar)) {
                 System.out.println(jugador2 + " ingrese piedra, papel o tijera: ");
                 jugadaJugador2 = scanner.nextLine();
             }
             if (jugadaJugador1.equals("piedra") && jugadaJugador2.equals("papel")){
                 ++puntosJugador2;
             }else if(jugadaJugador1.equals("papel") && jugadaJugador2.equals("papel")){
                 puntosJugador2 += 0;
                 puntosJugador1 += 0 ;
             }else if(jugadaJugador1.equals("tijera") && jugadaJugador2.equals("papel")){
                 ++puntosJugador1;
             }else if(jugadaJugador1.equals("piedra") && jugadaJugador2.equals("piedra")){
                 puntosJugador1 += 0;
                 puntosJugador2 += 0;
             }else if(jugadaJugador1.equals("papel") && jugadaJugador2.equals("piedra")){
                 ++puntosJugador1;
             }else if (jugadaJugador1.equals("tijera") && jugadaJugador2.equals("piedra")){
                 ++puntosJugador2;
             }else if(jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera")){
                 ++puntosJugador1;
             }else if (jugadaJugador1.equals("papel") && jugadaJugador2.equals("tijera")){
                 ++puntosJugador2;
             }else if(jugadaJugador1.equals("tijera") && jugadaJugador2.equals("tijera")){
                 puntosJugador1 += 0;
                 puntosJugador2 += 0;
             }
         }

            if (puntosJugador1 > puntosJugador2){
                System.out.println("el ganador es el jugador1--> "+ jugador1+", con un total de "+puntosJugador1+ " puntos; y el jugador2, "+ jugador2 +" obtuvo "+puntosJugador2+" puntos.");
         } else if (puntosJugador1 < puntosJugador2) {
                System.out.println("el ganador es el jugador2--> "+jugador2+", con un total de " + puntosJugador2 + " puntos; y el jugador1, "+jugador1+" obtuvo "+puntosJugador1+" puntos.");
         } else {
                System.out.println("hubo empate!!, ambos jugadores obtuvieron"+puntosJugador1+" puntos!");
         }
        }
}
