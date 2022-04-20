package Sesiones.Semana2.Hilos.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            String s = "Magia Pokemon!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Magia Pokemon!");

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}
