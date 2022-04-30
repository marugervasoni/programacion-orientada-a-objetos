package com.company;

public class Parcial extends Examen{

    //atributos
    private Integer numeroUnidadTomada;
    private Integer numeroDeReintentos;

    //constructor
    public Parcial(Alumno alumno, String temaExamen, String enunciado, Double nota, Integer numeroUnidadTomada, Integer numeroDeReintentos) {
        super(alumno, temaExamen, enunciado, nota);
        this.numeroUnidadTomada = numeroUnidadTomada;
        this.numeroDeReintentos = numeroDeReintentos;
    }

    //metodos
    public Boolean sePuedeRecuperar(){

        if (this.numeroDeReintentos <= 2){
            //System.out.println("Se puede recuperar--> hay intentos disponibles");
            return true; //hay intentos disponibles
        }
        else
            //System.out.println("No se puede recuperar--> no hay intentos disponibles");
            return false; //no hay intentos disponibles
        }
    }

