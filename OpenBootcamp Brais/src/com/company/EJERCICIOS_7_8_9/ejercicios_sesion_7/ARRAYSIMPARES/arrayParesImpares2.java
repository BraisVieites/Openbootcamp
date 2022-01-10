package com.company.EJERCICIOS_7_8_9.ejercicios_sesion_7.ARRAYSIMPARES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayParesImpares2 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        int num = 11;
        int[] numbers = new int[num];

        for (int i = 1; i < num; i++) {
            numbers[i] = i;
        }

        for (int i = 1; i < num; i++) {

            System.out.println(numbers[i]);
            numberList.add(i);
        }


        for (Iterator<Integer> iterator = numberList.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                System.out.println("Numeros impares:" + number);

        }

        }


    }


}
