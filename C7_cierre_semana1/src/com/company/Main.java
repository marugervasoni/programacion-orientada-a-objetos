package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //creo mi scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("nombre perro:");
        String nombrePerro = scanner.nextLine();
        System.out.println("alimento requerido:");
        Double cuantoAlimentoRequiere = scanner.nextDouble();


        //acá llamo la función
        Integer cantidadPaquetes = cuantosPaquetes(cuantoAlimentoRequiere);
        System.out.println(nombrePerro + " necesitó "+ cantidadPaquetes+" paquetes");
    }

        //la funcion la creo fuera del main y luegola llamo dentro del main
        public static Integer cuantosPaquetes(Double cuantoAlimentoRequiere){

            Scanner scanner =new Scanner(System.in); //creo otro scanner porque estó se encuentra por fuera del otro scanner.

            Double totalAlimento = 0.0;
            Integer cantidadPaquetes = 0;

            while(totalAlimento < cuantoAlimentoRequiere ){
                System.out.println("peso paquete: ");
                Double pesoPaquete = scanner.nextDouble();
                //totalAlimento = totalAlimento + pesoPaquete;
                totalAlimento += pesoPaquete;
                cantidadPaquetes++;
            }
            return cantidadPaquetes;
    }
}
