package com.company;

public class PizzaFactory {

    private static PizzaFactory instance;

    private PizzaFactory(){

    }

    public static PizzaFactory getInstance(){
        if (instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza generarPizza(String codigo){
        switch (codigo){
            case "MUZZA-CHICA":
                return new PizzaSimple("Muzzarella","la comun",700.0,false);
            case "ESPECIAL-CHICA":
                return new PizzaSimple("Especial","diferente",850.0,false);
            case "HAWAIANA" :
                return new PizzaSimple("Hawaiana","porque tiene ananá",950.0,false);
            case "COMBI-LOCA":
                PizzaCombinada pizzaCombinadaLoca = new PizzaCombinada("Combinada loca","mitad especial, mitad ananá");
                pizzaCombinadaLoca.agregarPizza(generarPizza("HAWAIANA"));
                pizzaCombinadaLoca.agregarPizza(generarPizza("ESPECIAL-CHICA"));
                return pizzaCombinadaLoca;
        }
        return null;
    }
}
