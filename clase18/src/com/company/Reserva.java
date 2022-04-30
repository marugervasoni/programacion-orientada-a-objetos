package com.company;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private Integer codigo;
    private String estacionDestino;
    private String estacionPartida;
    private Integer cantidadDePersonas;
    private Double precioBoleto;

    public Reserva(Integer codigo, String estacionDestino, String estacionPartida, Integer cantidadDePersonas, Integer precioBoleto) {
        this.codigo = codigo;
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
        this.cantidadDePersonas = cantidadDePersonas;
        this.precioBoleto = 50.0;
    }

    public Double calcularPrecio() {
    //hacer
    }
    //getters
    public String getEstacionDestino() {
        return estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public Double getPrecioBoleto() {
        return precioBoleto;
    }
}

