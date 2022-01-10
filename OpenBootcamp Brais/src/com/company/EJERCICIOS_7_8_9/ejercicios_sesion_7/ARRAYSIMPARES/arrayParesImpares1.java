package com.company.EJERCICIOS_7_8_9.ejercicios_sesion_7.ARRAYSIMPARES;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class arrayParesImpares1 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        System.out.println("Lista de numeros:" + numeros);

        for (Iterator<Integer> iterator = numeros.iterator(); iterator.hasNext(); ) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                System.out.println("Numeros pares:" + numero);
                iterator.remove();
            }


        }
        Collections.sort(numeros);
        System.out.println("Lista sin numeros pares:" + numeros);



    }

}
















