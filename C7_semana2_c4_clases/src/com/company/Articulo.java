package com.company;

//---creamos la clase:
public class Articulo {

    //---creamos los atributos (como privados): descripcion, precioVenta, stock
    private String descripcion;
    private double precioVenta;
    private int stock;

        //---creamos constructor de la clase Articulo (como publico):
        public Articulo(String descripcion, int cantidad, double precio){

            this.descripcion = descripcion;  //asi diferenciamos el atributo (descripcion) del parametro del mismo nombre
            precioVenta = precio;
            stock = cantidad;

        }

        //---creamos los metodos de la clase Articulo (como publicos): hayStock y consultarPrecio
        public boolean hayStock(){
            return stock>0;  //--> devuelve true si es mayor a 0, sino false.
        }
        public double consultarPrecio(){
            return precioVenta;
        }
}
