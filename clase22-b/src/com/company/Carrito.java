package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {  //la hago en cuarto lugar

    private List<Vendible> productos;

    //Hago su constructor que inicialice la lista
    public Carrito(){
        productos = new ArrayList<>();
    }

    //metodos
    public Double calcularPrecioCarrito(){
        //hacer
        Double precioFinal = 0.0;
        for (Vendible vendible : productos) {
            precioFinal += vendible.calcularPrecio();
        }
        return precioFinal;
    }

    //metodo de agregacion
    public void agregarProducto(Vendible vendible){
        productos.add(vendible);
    }
}
