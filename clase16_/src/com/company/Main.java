package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Contenedor contenedorChileno = new Contenedor(34,"Chile",true);
        Contenedor contenedorEspaniol = new Contenedor(37,"España",false);
        Contenedor contenedorJapones = new Contenedor(99,"Japon",true);
        Contenedor contenedorAmericano = new Contenedor(1,"Usa",true);
        Contenedor contenedorDesconocido = new Contenedor(56,"Desconocido",true);

        Puerto puerto =  new Puerto("Porto");
        puerto.agregarContenedor(contenedorAmericano);
        puerto.agregarContenedor(contenedorChileno);
        puerto.agregarContenedor(contenedorEspaniol);
        puerto.agregarContenedor(contenedorJapones);
        puerto.agregarContenedor(contenedorDesconocido);

        System.out.println(puerto.getNombre());
        puerto.mostrarContenedores();
        puerto.listarContPeligrososDesconocidos();





    }
}
