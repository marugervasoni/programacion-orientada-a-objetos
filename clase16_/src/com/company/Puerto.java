package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<>();
    }
    //getter
    public String getNombre() {
        return nombre;
    }

    public void agregarContenedor (Contenedor contenedor){
        this.contenedores.add(contenedor);
        this.contenedores.sort(null);
    }

    public void mostrarContenedores(){
        for (Contenedor contenedor : contenedores) {
            System.out.println(contenedor);
        }
    }

    public void listarContPeligrososDesconocidos(){
        Integer contPeligrosoDesconocido = 0;
        for (Contenedor contenedor : contenedores) {
            if (contenedor.getPeligroso() && contenedor.getPaisProcedencia() == "Desconocido"){
            contPeligrosoDesconocido++;
            }
        }
        System.out.println("Cantidad de contenedores peligrosos de procedencia Desconocida: "+contPeligrosoDesconocido);
    }
}
