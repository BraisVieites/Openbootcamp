package com.TryCatch;

import java.io.*;

public class inPutStream {

    public static void main(String[] args) {
        try {


            InputStream in = new FileInputStream("C:\\Users\\brais\\Documents\\PROGRAMACION 1.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("Excepcion:" + e.getMessage());
        }

    }
}
