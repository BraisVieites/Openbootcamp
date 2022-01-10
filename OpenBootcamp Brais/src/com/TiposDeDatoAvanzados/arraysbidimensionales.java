package com.TiposDeDatoAvanzados;

public class arraysbidimensionales {

    public static void main(String[] args) {

        /* CUANDO NO CONOCEMOS EL VALOR

        int arrayBidimensionales[][] = new int[2][4];
        arrayBidimensionales[0][0] = 1;
        arrayBidimensionales[0][1] = 2;
        arrayBidimensionales[0][2] = 3;
        arrayBidimensionales[0][3] = 4;

        arrayBidimensionales[1][0] = 10;
        arrayBidimensionales[1][1] = 20;
        arrayBidimensionales[1][2] = 30;
        arrayBidimensionales[1][3] = 40;

        for (int i = 0; i < arrayBidimensionales.length; i++) {
            System.out.println("Valor de i:" + i);

            for (int j = 0; j < arrayBidimensionales[1].length; j++) {
                System.out.println("Estoy en i = " + i + " ,j = " + j);
                System.out.println(arrayBidimensionales[i][j]);

            }

         */

        int arrayBidimensionales[][] = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
        };

        for (int i = 0; i < arrayBidimensionales.length; i++) {
            System.out.println("Valor de i:" + i);

            for (int j = 0; j < arrayBidimensionales[1].length; j++) {
                System.out.println("Estoy en i = " + i + " ,j = " + j);
                System.out.println(arrayBidimensionales[i][j]);

            }
        }

        String nombres[] = {"Brais","Sara","Hugo"};
        nombres[0]  = "Joan";
        nombres[1] = "jusep";

        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }

}

