package com.company;

public abstract class Embarcacion {

    //atributos
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;  //--> longitud en mts.

    //constructor
    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    //metodos
    public Double calcularAlquiler(){ //no es void sino double.
        if (anioFabricacion >= 2020){
            return precioBase + valorAdicional;
        } else {
            return precioBase;
        }
    }

    //getters y setters
}
