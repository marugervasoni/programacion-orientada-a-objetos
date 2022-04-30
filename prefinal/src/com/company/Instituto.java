package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasAcademicas;

    Instituto(){
        this.ofertasAcademicas = new ArrayList<>();
    }

    //metodo agregar OA
    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

    //metodo
    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            System.out.println(ofertaAcademica);
            //System.out.println("nombre"+ofertaAcademica.getNombre()+", Precio: "+ofertaAcademica.calcularPrecio());

        }

    }
}
