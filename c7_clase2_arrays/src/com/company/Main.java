package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //------------------SCANNER---------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar nombre");
        String nombre = scanner.nextLine(); //guardamos esto en una variable
        Integer edad = scanner.nextInt();

        //System.out.println("hola "+nombre+"edad "+edad);
        //System.out.println(("edad:"+edad));

        //--------------------CICLOS----------------
        if (edad >=18){
            //System.out.println("sos mayor de edad");
        }else {
            //System.out.println("sos menor de edad");
        }

        for (Integer i = 0; i < edad ; i++){
            //System.out.println(i);
        }
            //-------las funciones de abajo:
            contarHasta(edad);
            if (esPar(edad)){
                System.out.println("tu edad es par");
        }
            else{
                System.out.println("no es par");
        }


        //---------------FUNCIONES------------------
    }

    //escribimos la visibilidad (public o private (uso interno))
    //void --> cuando la funcion no devuelve nada.

    //entonces: visibilidad, metodo, nombre y parametros que recibe.
    public static void contarHasta(Integer numero){
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    }

    //---------------funcion es par---------------
    public static Boolean esPar(Integer numero){
        return numero % 2 == 0;
    }

}
