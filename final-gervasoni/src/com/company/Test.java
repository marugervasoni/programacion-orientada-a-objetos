package com.company;

public class Test {
    public static void main(String[] args) {
        // write your code here

        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarPizza(PizzaFactory.getInstance().generarPizza("MUZZA-CHICA"));
        pizzeria.agregarPizza(PizzaFactory.getInstance().generarPizza("ESPECIAL-CHICA"));
        pizzeria.agregarPizza(PizzaFactory.getInstance().generarPizza("HAWAIANA"));
        pizzeria.agregarPizza(PizzaFactory.getInstance().generarPizza("COMBI-LOCA"));

        pizzeria.mostrarPizzas();
    }
}
