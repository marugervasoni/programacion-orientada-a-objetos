package com.company;

public class Contenedor implements Comparable<Contenedor>{

    private Integer numeroID;
    private String paisProcedencia;
    private Boolean peligroso;

    public Contenedor(Integer numeroID, String paisProcedencia, Boolean peligroso) {
        this.numeroID = numeroID;
        this.paisProcedencia = paisProcedencia;
        this.peligroso = peligroso;
    }

    //getters


    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public Boolean getPeligroso() {
        return peligroso;
    }

    @Override
    public int compareTo(Contenedor contenedor) {

        if (this.numeroID > contenedor.numeroID){
            return 1;
        }
        if (this.numeroID < contenedor.numeroID){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return
                "numero ID = " + numeroID +
                ", pais de procedencia ='" + paisProcedencia + '\'' +
                ", Es peligroso = " + peligroso;
    }
}
