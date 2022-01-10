package com.TiposDeDatoAvanzados;

public class arrays {

    public static void main(String[] args) {

        /*
        // forma cuando no sabemos que valores va a tener el array

        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;



        for (int i : arrayUno){ //recorrer array
            System.out.println(i);

         */

        // forma cuando si sabemos los valores del array

        int arrayUno[] = {1, 2, 3, 4, 5};
        for (int numeros : arrayUno) { //recorrer array
            System.out.println(numeros);

            String nombres[] = {
                    "Brais",
                    "Sara",
                    "Hugo",

            };

            //forma corta de recorrer array for each
            for (String j : nombres) {
                System.out.println(j);
            }


            //forma larga de recorrer array sirve para ver en que posicion esta cada valor
            String ultimoNombre = "";
            for (int i = 0; i < nombres.length; i++) {
                System.out.println("Nombre actual:" + nombres[i] + "en posicion:" + i);
                ultimoNombre = nombres[i];
            }
            System.out.println(ultimoNombre);

            int contador = 0;
            while (contador < nombres.length) {
                System.out.println("Nombre actual");
                contador++;

            }
        }
    }
}



