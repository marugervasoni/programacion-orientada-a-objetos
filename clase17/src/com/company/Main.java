package com.company;

import java.sql.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Paciente paciente1 = new Paciente("Homero", "Simpson", "122", Date.valueOf("25/4/2022"),Date.valueOf("1/5/2022"));
        paciente1.getFechaInternacion();
        paciente1.getFechaAlta();
        paciente1.darAlta();

    }
}