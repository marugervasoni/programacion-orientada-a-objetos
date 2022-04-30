package com.company;

import java.util.Scanner;

public class Actividad4 {

    //programa que pueda informar sueldo
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double horasSemanalesTrabajadas;
        System.out.println("¿cuantas horas trabajo esta semana?");
        horasSemanalesTrabajadas = scanner.nextDouble();

        calcularSueldo(horasSemanalesTrabajadas);


        }
        public static void calcularSueldo(Double horasTrabajadas){
            Double sueldoSemanalJulieta = 0.0;
            Double valorHoraSemanal = 875.0;
            Double valorhHorasExtra = valorHoraSemanal * 1.5;
            Double horasSemanales = 40.0;
            Double horasExtra = 0.0;

            if (horasTrabajadas <= 40) {
                sueldoSemanalJulieta = horasTrabajadas * valorHoraSemanal;
                System.out.println("el sueldo semanal de Julieta es: $"+sueldoSemanalJulieta+", por "+horasTrabajadas+" horas, a : $"+valorHoraSemanal);
            }
            else {
                horasExtra = horasTrabajadas - horasSemanales;
                sueldoSemanalJulieta = (horasExtra * valorhHorasExtra) + (horasSemanales * valorHoraSemanal);
                System.out.println("el sueldo semanal de Julieta es: $"+sueldoSemanalJulieta+", por "+horasSemanales+", horas normales a: $"+valorHoraSemanal+"; y "+horasExtra+" horas extra a: $"+valorhHorasExtra);
            }
    }
}
