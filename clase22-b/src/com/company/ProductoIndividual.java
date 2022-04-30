package com.company;

public class ProductoIndividual implements Vendible{ //en segundo lugar

    private String nombre;
    private Double precio;

    //y su constructor
    public ProductoIndividual(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //sobreescribimos el metodo de lainterface
    @Override
    public Double calcularPrecio() {
        //los sout son didacticos
        System.out.println("encontre un producto "+ nombre+", su precio es de: "+ precio);
        return precio;
    }
}
