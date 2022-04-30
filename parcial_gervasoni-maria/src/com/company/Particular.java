package com.company;

public class Particular extends Paciente{

    private Double valorConsulta;
    private String dni;

    public Particular(Consulta consulta, String nombre, String apellido, Boolean primerConsulta, Double valorConsulta, String dni) {
        super(consulta, nombre, apellido, primerConsulta);
        this.valorConsulta = valorConsulta;
        this.dni = dni;
    }


    public Double getValorConsulta() {
        return valorConsulta;
    }
}
