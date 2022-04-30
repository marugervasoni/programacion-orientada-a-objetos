package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente(2,"pablo"); //instanciamos cliente

        //pruebo mis metodos
        cliente.incementarDeuda(500.0);
        cliente.incementarDeuda(-1000.0);
        cliente.pagarDeuda();
    }
}
