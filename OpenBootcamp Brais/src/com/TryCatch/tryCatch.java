package com.TryCatch;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

    public static void main(String[] args) {


        try {

            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mete un numero");

                try {

                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Numeros invalidos");
                }

            }while (!ok);

            //PrintStream
            PrintStream info = new PrintStream("copìa.txt");





            InputStream fichero = new FileInputStream("C:\\Users\\brais\\Documents\\PROGRAMACION 1.txt");
            BufferedInputStream ficheroBuffered = new BufferedInputStream(fichero);

            try {
                byte datos[] = new byte[5];
                int dato = fichero.read(datos);
                while (dato != -1){
                    // "EOF" End of file
                    System.out.print(datos.toString());
                    dato = fichero.read(datos);

                }

            }catch (IOException e) {
                System.out.println("no puedo leer" + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("oye no funcionaa" + e.getMessage());
        }

    }


}
