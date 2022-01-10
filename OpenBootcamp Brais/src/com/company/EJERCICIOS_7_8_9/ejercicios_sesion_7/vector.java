package com.company.EJERCICIOS_7_8_9.ejercicios_sesion_7;

import java.util.Vector;

public class vector {

    public static void main(String[] args) {

        //EL PROBLEMA DE USAR VECTORES ES QUE SE DUPLICA EXPONENCIALMENTE
        //EL USO DE MEMORIA
        //CADA VEZ QUE SOBREPASAMOS EL LIMITE QUE HEMOS MARCADO

        Vector<Integer> vector = new Vector();
        vector.add(10000);
        vector.add(20000);
        vector.add(30000);
        vector.add(4000);
        vector.add(500);

        System.out.println("Contenido del vector: " + vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println("Contenido del vector sin 2º y 3º elemento: " + vector);

    }
}
