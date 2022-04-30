package com.company;

public class Consulta {

    private String fechaConsulta;
    private String especialidad;
    private String horario;

    public Consulta(String fechaConsulta, String especialidad, String horario) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horario = horario;
    }




    public String getEspecialidad() {
        return especialidad;
    }
}
