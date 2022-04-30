package com.company;

public class Main {

    public static void main(String[] args) {
        Integer num1=5;
        Integer num2=14;
        int comparar;

        if (num1.equals(num2))
            System.out.println("iguales");
        else {
            comparar= num1.compareTo(num2);
            if (comparar>0)
                System.out.println("num1 es mayor");
            else
                System.out.println("num2 es mayor");
        }


    }
}
