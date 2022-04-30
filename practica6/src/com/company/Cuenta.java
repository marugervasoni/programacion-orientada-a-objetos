package com.company;

public abstract class Cuenta {

    private Cliente titular;
    private Double saldo;

   //hacer constructor
    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos
   public void depositarEfectivo(Double monto){
       Double deposito = this.saldo += monto;
       System.out.println("a tu saldo: "+this.saldo+ ", se le depositaron: " +monto+", quedando ahora: "+deposito);
   }
   public void extraerEfectivo(Double monto){
        if (monto <= this.saldo){
            this.saldo -= monto;
        } else {
            System.out.println("el saldo es insuficiente para realizar extraccion");
        }
       System.out.println("a tu saldo: "+this.saldo+ ", se le extrajeron: " +monto);
   }

   public void informarSaldo(){
       System.out.println("tu saldo actual es: "+this.saldo);
   }

   //getters y setter

    public Double getSaldo() {
        return saldo;
    }
}
