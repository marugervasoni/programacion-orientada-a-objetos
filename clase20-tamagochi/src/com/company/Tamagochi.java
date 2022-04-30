package com.company;

public class Tamagochi {

    private String nombre;
    private StateTamagochi estadoActual;

    public Tamagochi(String nombre, StateTamagochi estadoActual) {
        this.nombre = nombre;
        //this.estadoActual = new StateFeliz(); //este por default pero sino se lo puedo dar en el main
        this.estadoActual = estadoActual;
    }

    //metodos
    public void darDeComer(){
        //no puedo crear if aca, no aprovecho el patron asi
        estadoActual = estadoActual.comer(); //le mando el estimulo
    }

    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }

    public void darMimos(){
        estadoActual = estadoActual.recibirMimos();
    }
}
