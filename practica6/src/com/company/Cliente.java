package com.company;

public class Cliente {

    private Integer numeroCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(Integer numeroCliente, String apellido, String dni, String cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}
