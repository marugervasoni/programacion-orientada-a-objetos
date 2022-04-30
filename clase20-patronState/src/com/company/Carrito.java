package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;
    private StateCarrito estadoActual;

    public Carrito(List<Producto> productos, StateCarrito estadoActual) {
        this.productos = new ArrayList<>();
        this.estadoActual = estadoActual;
    }

    //hacer metodos
}
