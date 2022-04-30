package com.company;

public class Curso extends OfertaAcademica{

    //atributos
    private Double horasMensuales;
    private Double duracionMeses;
    private Double precioPorHora;

    //constructor
    public Curso(String nombre, String descripcion, Double horasMensuales, Double duracionMeses, Double precioPorHora) {
        super(nombre, descripcion);
        this.horasMensuales = horasMensuales;
        this.duracionMeses = duracionMeses;
        this.precioPorHora = precioPorHora;
    }

    //metodos
    @Override
    public Double calcularPrecio() {
        return horasMensuales * duracionMeses * precioPorHora;
    }
}
