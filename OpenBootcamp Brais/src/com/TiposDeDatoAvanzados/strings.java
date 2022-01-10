package com.TiposDeDatoAvanzados;



public class strings {

    public static void main(String[] args) {

        /*

        String cadena = "Mensaje de Texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de :" + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es:" + cadenaMinus);

        boolean resultado = cadena.startsWith("men");

        if (resultado){
            System.out.println("Empieza por lo que estoy buscando");

        }else {
            System.out.println("No empieza por lo que quiero");
        }

        boolean resultadoEnds = cadena.endsWith("o");

        if (resultadoEnds) {
            System.out.println("si acaba");
        }
        else {
            System.out.println("no acaba");
        }

        char letra = cadena.charAt(0);
        System.out.println("Caracter es:" + letra);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual:" +cadena.charAt(i));




        }
        */

        //ARRAY BIDIMENSIONAL

        int arrayBidi[][] = new int [2][4];

        //NUMERO DE FILAS
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        //NUMERO DE COLUMNAS
        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) {
        System.out.println("Valor de i:"+i);
    }



    }
}
