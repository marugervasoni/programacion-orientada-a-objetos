package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    //atributos
    private List<OfertaAcademica> ofertasAcademicas;
    private Double descuento;

    //constructor
    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        this.ofertasAcademicas = new ArrayList<>();
    }

    //metodos

            //Agregar oferta academica --> las agrego a mi array inicializado en el constructor
    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

            //se calcula sumando los precios de todos los cursos que forman
            // el programa y se bonifica un porcentaje
    @Override
    public Double calcularPrecio() {
        //hago una variable
        Double precioTotal = 0.0;
            //x cada OA de mi array OsAs le sumo a mi variable precioTotal,
            //su precio y le digo que lo calcule
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            precioTotal += ofertaAcademica.calcularPrecio();
        }
        return precioTotal - (precioTotal*descuento); //asi le resto el valor de desc.
    }
}
