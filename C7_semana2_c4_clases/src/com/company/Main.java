package com.company;

public class Main {

    public static void main(String[] args) {
	//---instanciamos nuestra clase Articulo:

        //-->creamos un objeto o instancia de la clase Articulo:
        Articulo articulo = new Articulo("Articulo 1",100,1100.00);

        //-->utilizamos elmetodo .hayStock():
        if (articulo.hayStock())
        {
            System.out.println("hay stock disponible");
        }

        //-->utilizamos elmetodo .consultarPrecio():
        System.out.println("El precio de venta es " + articulo.consultarPrecio());
    }
}
