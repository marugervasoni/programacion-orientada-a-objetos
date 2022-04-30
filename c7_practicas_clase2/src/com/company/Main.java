package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //scanner
        //objeto de java para escribir input en la consola
        //haciendo un main mas dinamico

        //creacion: declararlo (y con alt+enter se importa la clase arriba)

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar nombre");
        String nombre = scanner.nextLine(); //guardamos esto en una variable
        System.out.println("hola "+nombre);

    }

}
