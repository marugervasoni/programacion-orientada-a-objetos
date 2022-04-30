package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Consulta consulta1 = new Consulta("4 de abril","odontologia","20. 30hs");
        Consulta consulta2 = new Consulta("4 de abril","pediatra","18.00hs");
        Consulta consulta3 = new Consulta("5 de abril","oftalmologia","10.30hs");

        Particular particular1 = new Particular(consulta1,"Maria","Gervasoni",true,1500.0,"39517575");

        DeObraSocial deObraSocial1 = new DeObraSocial(consulta2,"azul","azules",false,"osde",21);
        DeObraSocial deObraSocial2 = new DeObraSocial(consulta3,"Charly","Garcia",true,"osuthgra",70);


        //prueba
        System.out.println("el paciente particular: "+particular1.getNombre()+" "+particular1.getApellido()+", asiste por la especialidad: "+particular1.getConsulta().getEspecialidad());
        System.out.println("¿debemos realizar evaluacion inicial?: "+ particular1.hacerEvaluacionInicial());
        System.out.println("valor de la consulta: $"+particular1.getValorConsulta());

        System.out.println("el paciente que tiene Obra Social: "+deObraSocial1.getNombre()+" "+deObraSocial1.getApellido()+", asiste por la especialidad: "+deObraSocial1.getConsulta().getEspecialidad());
        System.out.println("¿debemos realizar evaluacion inicial?: "+ deObraSocial1.hacerEvaluacionInicial());
        System.out.println("es un paciente mayor por numero de asociado ("+deObraSocial1.getNumeroDeAsociado()+"), que el paciente "+deObraSocial2.getNombre()+", (numero de asociado "+deObraSocial2.getNumeroDeAsociado()+")?");
        deObraSocial1.compareTo(deObraSocial2);
        if (deObraSocial1.compareTo(deObraSocial2)>1){
            System.out.println("SI");
        }
        else {
            System.out.println("NO");
        }
    }
}
