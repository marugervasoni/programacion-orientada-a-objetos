package com.company;

public class Cliente {
    //programar la clase cliente en base al UML

    //atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //metodos
        //constructor
        public Cliente(Integer numeroCliente, String nombre){
            this.numeroCliente = numeroCliente;
            this.nombre = nombre;
            this.deuda = 0.0; //establecemos valor inicial
        }

     public void incementarDeuda(Double valor) {

            if (valor > 0){
                System.out.println("mi deuda era de "+deuda+ "e incremento a "+valor);
                this.deuda+=valor;
                System.out.println("mi deuda actual es de "+deuda);
            }
            else {
                System.out.println("no se puede incrementar deuda por valores negativos");
            }
     }

     public void pagarDeuda(){
            this.deuda = 0.0;
         System.out.println("tu deuda fue pagada");
     }


     //getters y setters

    public void setNumeroCliente(Integer numeroCliente) { //el tipo de dato en el parametro (porque es void)
        this.numeroCliente = numeroCliente;
    }
    public Integer getNumeroCliente() { //el tipo dato al lado de la visibilidad (porque devuelve)
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
}
