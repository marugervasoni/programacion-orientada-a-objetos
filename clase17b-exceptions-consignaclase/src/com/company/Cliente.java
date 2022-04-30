package com.company;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private Double saldoEnCuenta;
    private Double deuda;
    private Double limite;

    public Cliente(String nombre, String apellido, String dni, Double limite) throws ClienteException {

        //agrego la excepcion para que siempre se determine un limite
        if(limite<0){
            throw new ClienteException("limite no valido");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
        deuda = 100.0;
        saldoEnCuenta = 0.0;
    }

    public void comprar(Double importe) throws ClienteException{
        //hacer
        if (importe > this.limite){
            throw new ClienteException("el importe supera el limite establecido");
        }
    }

    public void saldarDeuda(Double importe) throws ClienteException{
        //hacer
        if (importe <= 0){
            throw new ClienteException("no podes ingresar montos negativos");
        }
        if (importe > this.deuda){
            throw new ClienteException("el importe es mayor que la deuda a saldar");
        }
        this.deuda -= importe;
    }

    public Double getLimite(){
        return this.limite;
    }
}
