package com.company;

public abstract class Examen {

    //atributos
    private Alumno alumno;
    private String temaExamen;
    private String enunciado;
    private Double nota;

    //constructor
    public Examen(Alumno alumno, String temaExamen, String enunciado, Double nota) {
        this.alumno = alumno;
        this.temaExamen = temaExamen;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    //metodos
    public String titulo() {
        return "el tema del examen es: " + this.temaExamen + ". El enunciado es: " + this.enunciado + ". La nota es: " + this.nota + ".";
    }

    public Boolean estaAprobado() {

        if (this.nota >= 4) {
            return true;
        }
        else {
            return false;
        }
    }

    //getters y setters
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}