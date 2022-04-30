package com.company;

public class Perros {

    //atributos
    private String nombre;
    private Boolean adoptado;
    private String raza;
    private Integer añoNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;


    //constructor
    public Perros(String nombre, Boolean adoptado, String raza, Integer añoNacimiento, Double peso, Boolean tieneChip, Boolean estaLastimado) {
        this.nombre = nombre;
        this.adoptado = adoptado;
        this.raza = raza;
        this.añoNacimiento = añoNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
    }

    //metodos
    public Integer preguntarEdad(){
        Integer añoActual = 2022;
        return añoActual - añoNacimiento;
    }

    public Boolean sePuedePerder(){
        if (this.tieneChip){
            return false;
        } else {
            return true;
        }
    }

    public Boolean sePuedeAdoptar(){
        if(!this.estaLastimado && this.peso > 5.0){
            return true;
        } else {
            return false;
        }
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(Boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }
}
