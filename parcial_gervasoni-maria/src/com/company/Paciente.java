package com.company;

public abstract class Paciente {

    private Consulta consulta;
    private String nombre;
    private String apellido;
    private Boolean primerConsulta;


    public Paciente(Consulta consulta, String nombre, String apellido, Boolean primerConsulta) {
        this.consulta = consulta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primerConsulta = primerConsulta;
    }

    public Boolean hacerEvaluacionInicial() {
        if (primerConsulta){
            return true;
        } else {
            return false;
        }
    }




    public Consulta getConsulta() {
        return consulta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
