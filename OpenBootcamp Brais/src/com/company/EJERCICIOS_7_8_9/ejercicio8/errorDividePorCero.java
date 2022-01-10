package com.company.EJERCICIOS_7_8_9.ejercicio8;

import java.util.Scanner;

public class errorDividePorCero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe dos numeros");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();


        try {
            int resultado = numeroA / numeroB;
            System.out.println("Resultado es "+ resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }

    }
}
