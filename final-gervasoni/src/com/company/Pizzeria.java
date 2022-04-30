package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private String nombre;
    private List<Pizza> pizzas;

    public Pizzeria(){
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void mostrarPizzas(){
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }


}
