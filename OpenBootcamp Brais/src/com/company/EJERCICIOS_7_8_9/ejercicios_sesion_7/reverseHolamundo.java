package com.company.EJERCICIOS_7_8_9.ejercicios_sesion_7;

public class reverseHolamundo {

    public static void main(String[] args) {


        String cadena = "Hola Mundo";



            for (int i = 9; i < cadena.length(); i--) {
                System.out.print(cadena.charAt(i));
                if (i == 0) {break;}

            }

        }
}

