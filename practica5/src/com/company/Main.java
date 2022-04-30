package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UsuarioJuego usuario1 = new UsuarioJuego("maru","1234");

        System.out.println("usuario: "+usuario1.getNombre()+", puntaje: "+usuario1.getPuntaje()+", nivel: "+usuario1.getNivel());
        usuario1.aumentarPuntaje();
        System.out.println("usuario: "+usuario1.getNombre()+", puntaje: "+usuario1.getPuntaje()+", nivel: "+usuario1.getNivel());
        usuario1.subirNivel();
        System.out.println("usuario: "+usuario1.getNombre()+", puntaje: "+usuario1.getPuntaje()+", nivel: "+usuario1.getNivel());
        usuario1.bonus(10);
        System.out.println("usuario: "+usuario1.getNombre()+", puntaje: "+usuario1.getPuntaje()+", nivel: "+usuario1.getNivel());
    }
}
