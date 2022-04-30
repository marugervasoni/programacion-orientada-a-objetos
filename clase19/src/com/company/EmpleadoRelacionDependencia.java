package com.company;

public class EmpleadoRelacionDependencia extends Empleado{

    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(Integer dias) {
        //Double sueldoPorDia = sueldoMensual / 30;
        //return dias * sueldoPorDia; --> es lo mismo que:
        return sueldoMensual * dias /30;
    }
}
