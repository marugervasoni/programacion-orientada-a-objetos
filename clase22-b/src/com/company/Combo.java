package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Vendible{ //en tercer lugar

    private Double descuento;
    private List<Vendible> productos;

    //su constructor
    public Combo(Double descuento) {
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }

    //metodo de agregacion
    public void agregarProductos(Vendible vendible){
        productos.add(vendible);
    }

    //sobreescribimos el metodo de lainterface
    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        //los sout son didacticos
        System.out.println("recorriendo un combo");
        for (Vendible vendible : productos) {
            precioTotal += vendible.calcularPrecio(); //por el polimorfismo sabe que calcular
        }
        Double precioFinal = precioTotal - (precioTotal*descuento);
        //los sout son didacticos
        System.out.println("recorri el combo, su precio final es: $"+precioFinal);
        return precioFinal;
    }
}
