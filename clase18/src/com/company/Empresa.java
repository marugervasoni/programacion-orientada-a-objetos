package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //atributo
    private List<Reserva> reservas;

    //constructor
    public Empresa() {
        this.reservas = new ArrayList<>();
    }
    //metodo para agregar reservas
    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    //definimos recorrido
    public List<String> recorrido(){
        List<String> recorrido = new ArrayList<>();
        recorrido.add("Buenos Aires");
        recorrido.add("Lujan");
        recorrido.add("Mercedes");
        recorrido.add("Suipacha");
        recorrido.add("Chivilcoy");
        recorrido.add("Alberti");
        recorrido.add("Bragado");
        return recorrido;
    }


    public Integer cantVecesRecorrida(){
        //hacer
    }
    public Integer recaudacionTotal(){
        //hacer
    }
}
