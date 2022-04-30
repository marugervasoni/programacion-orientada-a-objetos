package com.company;

public class EmpleadoFactory {

    //ultimo --opcional (porque hago constantes)
    //hago constantes para los codigos (public static final):---------------
    public static final String CLAVE_EMPLEADO_DEPENDENCIA = "EMP-INT";
    public static final String CLAVE_EMPLEADO_CONTRATADO = "EMP-EXT";
    //--> realizadas, me voy al main e invoco las constantes en empleado faCTORY

    //primero
    //hago primero el singleton-------------------------------------------
        //instance (privado y estatico)
    private static EmpleadoFactory instance = new EmpleadoFactory();

        //constructor privado
    private EmpleadoFactory(){

    }

        //metodo get instance estatico
    public static EmpleadoFactory getInstance(){
        if (instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }
    //--------------------------------------------------------------

    //segundo
        //hacemos la factory (publico de tipo empleado)
    public Empleado generarEmpleado(String codigo) { //throws EmpleadoFactoryException{
        switch (codigo){
            //case "EMP-INT" : --> Cambio el case poniendo la constante
            case CLAVE_EMPLEADO_DEPENDENCIA:
                return new EmpleadoRelacionDependencia("Cosme","Fulanito",123,1000.0);
            //case "EMP-EXT" : --> Lo mismo
            case CLAVE_EMPLEADO_CONTRATADO:
                return new EmpleadoContratado("Kito", "Pizza",1234,7.0,0.14);

                //--->agrego un caso default retornando null
            default:
                System.out.println("no encontramos este elemento para construir");
                return null;

               //--->o una excepcion
            //default:
                //throw new EmpleadoFactoryException("codigo invalido");

        }

    }
}
