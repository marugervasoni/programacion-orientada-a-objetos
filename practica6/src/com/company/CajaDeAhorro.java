package com.company;

public class CajaDeAhorro extends Cuenta{

    private Double tasaInteres;

    public CajaDeAhorro(Cliente titular, Double saldo, Double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }


    public void cobrarInteres(){
        System.out.println(super.getSaldo() * this.tasaInteres);
    }


}
