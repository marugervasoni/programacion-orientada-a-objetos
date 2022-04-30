package com.company;

public class ClienteException extends Exception { //nuestra excepcion debe extender Exception

    //creamos el constructor
    public ClienteException(String message) {
        super(message);
    }

}
