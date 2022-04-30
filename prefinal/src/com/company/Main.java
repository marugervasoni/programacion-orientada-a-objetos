package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //primero hago mi bolsa principal (el sistema)
        Instituto instituto = new Instituto();

        //invoco  el get instance de mi fabrica
        OfertaAcademicaFactory ofertaAcademicaFactory = OfertaAcademicaFactory.getInstance();

        //Genero mis objetos usando los codigos predeterminados en mi fabrica
        ofertaAcademicaFactory.generarOfertaAcademica("FRONTEND");
        ofertaAcademicaFactory.generarOfertaAcademica("FULLSTACK");
        ofertaAcademicaFactory.generarOfertaAcademica("BACKEND");
    }
}
