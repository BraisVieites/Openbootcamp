package com.TiposDeDatoAvanzados;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        //CapacidadVector = CapacidadVector *2
        //
        //CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0,5);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");


        for(Object arrayObjecto : lista.toArray()){
            System.out.println(arrayObjecto.toString());
        }

        /*

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++){
            array[i] = lista.get(i);

            for (String elemento : array){
                System.out.println("Elemento es:" + elemento);
            }

        }

        lista.remove(2);


        System.out.println("Contenido" +lista);

        for(String nombre : lista){
            System.out.println(nombre);
        }

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        */


    }
}
