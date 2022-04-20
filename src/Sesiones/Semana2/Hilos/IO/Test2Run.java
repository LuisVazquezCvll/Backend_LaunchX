package Sesiones.Semana2.Hilos.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run{
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("C:\\magiaRun.txt");
                    String s = "Magia Pokemon con Runnable!";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println("Magia Pokemon con runnable!");

                } catch (IOException ioe) {
                    ioe.printStackTrace();

                }
            }
        };

        Thread magic = new Thread(rm);
        magic.start();
    }
}
