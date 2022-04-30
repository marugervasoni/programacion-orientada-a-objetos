package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente1 = null;

        try {
            System.out.println("cliente 1: ");
            cliente1 = new Cliente("Cosme","Fulanito","1234567",-500.0);
        }catch (ClienteException e){
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }

        Cliente cliente2 = null;
        try {
            cliente2 = new Cliente("harry","stiles","4739",150.0);
        } catch (ClienteException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }
        try{
            cliente2.saldarDeuda(-400.0);
        }catch (ClienteException e){
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }

        try{
            cliente2.comprar(1000.0);
        }catch (ClienteException e){
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
