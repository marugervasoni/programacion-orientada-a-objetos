package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //crear productos individuales
        ProductoIndividual fritas = new ProductoIndividual("papas fritas",100.0);
        ProductoIndividual coca = new ProductoIndividual("cocucha",50.0);

        //crear combos
        Combo combo1 = new Combo(0.1);
        combo1.agregarProductos(coca);
        combo1.agregarProductos(coca);
        combo1.agregarProductos(fritas);

        //crear carrito --le agrego los productos para que me calcule el total
        Carrito carrito = new Carrito();
        carrito.agregarProducto(combo1);
        carrito.agregarProducto(fritas);

        System.out.println(carrito.calcularPrecioCarrito());


    }
}
