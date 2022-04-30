package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1,"gerva","hkjdjv","dnfl");

        CajaDeAhorro cajaA1 = new CajaDeAhorro(cliente,15000.0,0.5);

        CuentaCorriente cuentaC1 = new CuentaCorriente(cliente,100.0,5000.0);

        System.out.println("prueba caja ahorro");
        cajaA1.extraerEfectivo(10000.0);
        cajaA1.informarSaldo();
        System.out.println("prueba cuenta corriente");
        cuentaC1.extraerEfectivo(500.0);
        cuentaC1.depositarEfectivo(2000.0);
        cuentaC1.informarSaldo();
    }
}
