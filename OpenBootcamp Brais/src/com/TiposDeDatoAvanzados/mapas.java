package com.TiposDeDatoAvanzados;

import java.util.HashMap;
import java.util.Map;

public class mapas {

    public static void main(String[] args) {

        //MAPAS O ARRAY ASOCIATIVO // ES UNA ESPECIO DE DICCIONARIO DONDE TENGO UNA CLAVE Y UN VALOR

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Clave1",10);
        mapa.put("Clave2",20);
        mapa.put("Clave3",30);
        // mapa.replace("Clave4",190);

        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento clave es: " + elemento.getValue());

        }

        mapa.remove("Clave2");

        System.out.println(mapa);
        // mapa.replace("Clave3",90);


    }
}
