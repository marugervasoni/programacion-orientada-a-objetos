package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //atributos-----------------------------------------------------------
    private String razonSocial;
    private List<Empleado> empleados;

    //constructor--------------------------------------------------------
    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    //--->metodo para agregar objetos a la lista--------------------------
    //A)
        //public void agregarEmpleado(Empleado empleado){
            //empleados.add(empleado);

    //B)
        //--como yo ya tengo mi factory, cambio mi metodo(y sus parametros):
        //--y lo encierro en un try catch porque hay una exception:
        //public void agregarEmpleado(String codigo){
        //try {
        //  empleados.add(EmpleadoFactory.getInstance().generarEmpleado(codigo));
        //}catch (EmpleadoFactoryException e){
        //System.out.println(e.getMessage());

     //C)
        //--si ya genere constantes de codigo para crear empleados y no tengo excepciones
     public void agregarEmpleado(String codigo){
         empleados.add(EmpleadoFactory.getInstance().generarEmpleado(codigo));
        }
    //-----------------------------------------------------------------------

    //metodo en el que recorremos la lista de empleados, para calcular------
    //todos los sueldos e ir agregando el importe de cada uno, en la
    // variable sueldos totales.
    public Double calcularSueldosTotales(Integer dias){

        Double sueldosTotales = 0.0;

        for (Empleado empleado : empleados) {
            sueldosTotales += empleado.calcularSueldo(dias);

        }
        return sueldosTotales; //devuelvo el importe total luego de recorrer.
    }
}
