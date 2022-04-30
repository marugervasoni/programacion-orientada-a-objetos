package com.company;

public class OfertaAcademicaFactory {

    //singleton-------------------------------------------------------------
    //Metodo privado y estatico
    private static OfertaAcademicaFactory instance;

    //constructor privado
    private OfertaAcademicaFactory(){

    };

    //Metodo getInstance estatico
    public static OfertaAcademicaFactory getInstance(){
        if (instance == null){
            instance = new OfertaAcademicaFactory();
        } return instance;
    }
    //--------------------------------------------------------------------
    //factory.............................................................
    public OfertaAcademica generarOfertaAcademica(String codigo){
        switch (codigo){
            case "FRONTEND":
                return new Curso("Front end","programar1",16.0,2.0,1000.0);
            case "BACKEND" :
                return new Curso("Back end","soy programar",900.0,20.0,2.0);
            case "FULLSTACK" :
                ProgramaIntensivo fullstack = new ProgramaIntensivo("Full stack", "algo", 0.2);
                fullstack.agregarOfertaAcademica(generarOfertaAcademica("BACKEND"));
                fullstack.agregarOfertaAcademica(generarOfertaAcademica("FRONTEND"));
                return fullstack;
        }
        return null;
    }
}
