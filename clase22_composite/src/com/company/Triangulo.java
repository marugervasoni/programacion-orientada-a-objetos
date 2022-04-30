package com.company;

public class Triangulo implements FiguraGeometrica {

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularSuperficie() {
        //base * altura / 2
        return null;
    }
}
