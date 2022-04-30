package com.company;

import java.util.Date;

public class Paciente {

    private String nombre;
    private String apellido;
    private String historiaClinica;
    private Date fechaInternacion;
    private Date fechaAlta;

    //constructor
    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion, Date fechaAlta) {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = null;
        //this.historiaClinica = historiaClinica;
        if (fechaInternacion.before(hoy)) {
            this.fechaInternacion = fechaInternacion;
        }
    }

    //getters
    public Date getFechaInternacion(){
        return fechaInternacion;
    }
    public Date getFechaAlta(){
        return fechaAlta;
    }

    //metodos
    public void  darAlta(){
        if (fechaAlta.after(fechaInternacion)){
            System.out.println("Ok");
        } else {
            System.out.println("No se puede");
        }
    }
}