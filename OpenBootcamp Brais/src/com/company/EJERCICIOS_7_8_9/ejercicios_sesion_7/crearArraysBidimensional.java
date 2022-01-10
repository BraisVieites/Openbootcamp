package com.company.EJERCICIOS_7_8_9.ejercicios_sesion_7;

public class crearArraysBidimensional {

    public static void main(String[] args) {

        int[][] arrayBidimensional = new int[2][4];
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[0][2] = 3;
        arrayBidimensional[0][3] = 4;
        arrayBidimensional[1][0] = 10;
        arrayBidimensional[1][1] = 20;
        arrayBidimensional[1][2] = 30;
        arrayBidimensional[1][3] = 40;

        for (int i = 0; i < arrayBidimensional.length;i++){
            for (int j= 0;j < arrayBidimensional[1].length; j++){
                System.out.println("Posicion: ["+ i +"]["+ j + "] y contiene el valor: " + arrayBidimensional[i][j] );
            }
        }


    }
}
