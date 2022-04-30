package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Perros perro1 = new Perros("firu",false,"cocker",2020,6.0,true,false);

        System.out.println("perro: "+perro1.getNombre());

        System.out.println("se puede adoptar? "+perro1.sePuedeAdoptar());
        System.out.println("edad? "+perro1.preguntarEdad());

    }
}
