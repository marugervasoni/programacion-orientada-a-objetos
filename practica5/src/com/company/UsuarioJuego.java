package com.company;

public class UsuarioJuego {

    //atributos
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    //constructor
    UsuarioJuego(String nombre,String clave){
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 1;
    }

    //metodos
    public void aumentarPuntaje(){
        this.puntaje ++;
        System.out.println("el puntaje actual es: "+this.puntaje);
    }
    public void subirNivel(){
        this.nivel ++;
        this.puntaje = 0.0;
        System.out.println("el nivel actual es: "+this.nivel+ ", con "+this.puntaje+" puntos.");
    }
    public void bonus(int valor){
        this.puntaje += valor;
        System.out.println("el puntaje actual por bonus es: "+this.puntaje);
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
