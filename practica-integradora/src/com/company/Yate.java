package com.company;

public class Yate extends Embarcacion implements Comparable{

    //atributos
    private Integer cantidadCamarotes;

    //constructor
    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    //metodos //como lo hago?
    @Override
    public int compareTo(Object object) {

        //casteo object a yate
        Yate otroYate = (Yate)object;

        if (this.cantidadCamarotes > otroYate.cantidadCamarotes){
            return 1;
        }
        if (this.cantidadCamarotes < otroYate.cantidadCamarotes){
            return -1;
        }
        return 0;

        //si trabajo con integers: return this.cantidadCamarotes- otroYate.cantidadCamarotes;
    }
    //getters y setters
        //los usare si tengo que acceder por ejemplo a precio base, que como es de mi padre
        //es privado. : ejemplo debo comparar precioBase en vez de cantidadCamarote.
            //Entonces: if(this.getPrecioBase > otroYate.getPrecioBase);
}

