package com.company;

public class DeObraSocial extends Paciente implements Comparable{

    private String nombreObraSocial;
    private Integer numeroDeAsociado;

    public DeObraSocial(Consulta consulta, String nombre, String apellido, Boolean primerConsulta, String nombreObraSocial, Integer numeroDeAsociado) {
        super(consulta, nombre, apellido, primerConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroDeAsociado = numeroDeAsociado;
    }

    @Override
    public int compareTo(Object object) {

        DeObraSocial otroDeObraSocial = (DeObraSocial) object;

        if (this.numeroDeAsociado > otroDeObraSocial.numeroDeAsociado){;
            return 1;
        }
        if (this.numeroDeAsociado < otroDeObraSocial.numeroDeAsociado){
            return -1;
        }
        return 0;


    }


    public Integer getNumeroDeAsociado() {
        return numeroDeAsociado;
    }
}
