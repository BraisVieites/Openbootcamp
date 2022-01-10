package com.TiposDeDatoAvanzados;

import java.math.BigDecimal;

public class bigDecimal {

    public static void main(String[] args) {

        /*

        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(0.1f);

        valorA.add(valorB);
        valorA.add(valorB);


        System.out.println(valorA.toString());

         */

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        BigDecimal resultado = valorA.add(valorB);





        System.out.println(resultado.toString());
    }


}
