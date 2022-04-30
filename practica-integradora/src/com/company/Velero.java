package com.company;

public class Velero extends Embarcacion{

    //atributos
    private Integer cantidadMastiles;

    //constructor
    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    //metodos
    public Boolean esGrande(Integer cantidadMastiles){
        //puedo hacer esto: return cantidadMastiles > 4; y ahi termina.

        if (cantidadMastiles > 4){
            return true;
        } else {
            return false;
        }

    }



    //getters y setters
    public Integer getCantidadMastiles() {
        return cantidadMastiles;
    }
    public void setCantidadMastiles(Integer cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
}
