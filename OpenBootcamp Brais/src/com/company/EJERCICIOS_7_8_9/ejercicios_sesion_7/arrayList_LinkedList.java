package com.company.EJERCICIOS_7_8_9.ejercicios_sesion_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class arrayList_LinkedList {

    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Brais");
        lista.add("Sara");
        lista.add("Hugo");
        lista.add("Anna");

        for (Object arrayNombres : lista.toArray()) {
            System.out.println(arrayNombres.toString());

        }



            LinkedList<String> listaEnlazada = new LinkedList<String>(lista);


            for(int i = 0; i < listaEnlazada.size(); ++i) {
                System.out.println("Valor en la posicion " + i + " de la lista: " + (String)listaEnlazada.get(i));


            }


    }
}

