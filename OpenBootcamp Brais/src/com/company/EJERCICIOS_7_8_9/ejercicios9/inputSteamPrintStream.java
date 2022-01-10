package com.company.EJERCICIOS_7_8_9.ejercicios9;

import java.io.*;

public class inputSteamPrintStream {

    public static void main(String[] args) {

        try {
           InputStream fileIn = new FileInputStream("C:\\Users\\brais\\Documents\\PROGRAMACION 1.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fileIn);
            byte []datos = fileIn.readAllBytes();

                    PrintStream fileOut = new PrintStream("destino");

                    fileOut.write(datos);


            }catch (IOException e){
                System.out.println("Excepcion:" + e.getMessage());
            }

    }
}
