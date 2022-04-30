
package com.company;
public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraerEfectivo(Double monto) {
        Double saldoFaltante;
        if (monto <= super.getSaldo()) {
            Double extraccion;
            extraccion = super.getSaldo() - monto;
        } else {
            saldoFaltante = super.getSaldo() - monto;
            this.montoAutorizado += saldoFaltante;
        }
    }
}