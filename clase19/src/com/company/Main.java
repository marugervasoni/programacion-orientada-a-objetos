package com.company;

public class Main {

    public static void main(String[] args) {//throws EmpleadoFactoryException {
	// write your code here

        //invoco la fabrica
        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        //creo una empresa para poder probar luego los metodos
        Empresa empresa =new Empresa("Mostaza SRL");

        //empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        //empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        //empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));

        empresa.agregarEmpleado(empleadoFactory.CLAVE_EMPLEADO_DEPENDENCIA);
        empresa.agregarEmpleado(empleadoFactory.CLAVE_EMPLEADO_CONTRATADO);


        System.out.println(empresa.calcularSueldosTotales(20));





    }
}
