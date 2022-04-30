package com.company;

public abstract class OfertaAcademica {

    //1. atributos
    private String nombre;
    private String descripcion;

    //2.constructor
    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //3.metodos
    public abstract Double calcularPrecio();

    //getter
    public String getNombre() {
        return nombre;
    }

    //@Override
    //public String toString() {
     //   return "Curso"+ nombre + "pecio "+calcularPrecio();
    //}
}
