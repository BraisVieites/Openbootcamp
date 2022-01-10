package com.TiposDeDatoAvanzados;

import java.util.Vector;

public class vectores {

    public static void main(String[] args) {

        //son como los arrays pero no le damos un tamaño si no queremos

        Vector<Integer> vector = new Vector(16);

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("capacidad:" + vector.capacity() + " Tamaño: " + vector.size());
        vector.trimToSize();
        System.out.println("capacidad:" + vector.capacity() + " Tamaño: " + vector.size());


        /*

        System.out.println(vector.get(3));
        vector.remove(3);
        System.out.println(vector.get(3));

         */

/*
        for (int i : vector){
            System.out.println("valor actual del vector " + i);
        }


        for (int i = 0 ; i < vector.size() ; i++){
            if (i % 2 == 0){
                vector.remove(i);
                continue;

            }
            System.out.println("Valor es " + vector.get(i) + "en posicion " +i);
        }

 */


        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales" + resultado);



        System.out.println("Datos del vector" + vector);

        vector.remove(2);
        System.out.println("datos del vector" + vector);

        System.out.println("Vector tamaño:" + vector.size()+ "Vector capacidad:" + vector.capacity());
    }
}
