package com.company;

public class Persona implements Comparable {

    private int edad; //atributo

    public int getEdad(){  //getter de edad
        return this.edad;
    }

   public void decirEdad(){   //metodo que usaremos para mostrar la edad
       System.out.println(this.edad);
   }

    @Override
    public int compareTo(Object o) { //casteamos a persona como objeto

        //codigo original:--------------------------------
        //Persona p = (Persona) o;

        //if(this.edad > p.getEdad()) {
            //return 1; // --> mayor a cero
        //}
        //else if(this.edad > p.getEdad()) {
            //return -1; //--> menor a cero
        //}
        //return 0; //--> para el caso que sean iguales

        //o podemos escribir:-----------------------------
        //return this.edad - p.getEdad();

        // o sino tambien:-------------------------------
        // sin hacer la variable p de linea 17
        return this.edad - ((Persona)o).getEdad(); //casteamos persona.
    }
}
