package com.company;

public class Rectangulo implements FiguraGeometrica{

    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double calcularSuperficie() {
        //alto * largo
        return this.alto * this.largo;
    }
}
