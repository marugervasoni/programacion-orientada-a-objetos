package com.company;

public class Final extends Examen implements Comparable{

    //atributos
    private Double notaDeOral;
    private Double notaEscrita; //agregada pero no la pide la consigna(?
    private String descripcionTemaRendido;

    //constructor
    public Final(Alumno alumno, String temaExamen, String enunciado, Double nota, Double notaDeOral, Double notaEscrita, String descripcionTemaRendido) {
        super(alumno, temaExamen, enunciado, nota);
        this.notaDeOral = notaDeOral;
        this.notaEscrita = notaEscrita;
        this.descripcionTemaRendido = descripcionTemaRendido;
    }

    //metodos
    @Override
    public int compareTo(Object object) {

        Double promedioFinal1 = this.notaDeOral + this.notaEscrita;
        Final otroFinal = (Final)object;
        Double promedioOtroFinal = otroFinal.notaDeOral + otroFinal.notaEscrita;

        if (promedioFinal1 > promedioOtroFinal){
            return 1;
        }
        if (promedioFinal1 < promedioOtroFinal){
            return -1;
        }
        return 0;

    }

    @Override
    public Boolean estaAprobado() {
        if ((this.notaEscrita >= 4) && (this.notaDeOral >= 4)) {
            return true;
        }
        else {
            return false;
        }
    }

}
