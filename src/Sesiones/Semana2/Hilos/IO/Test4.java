package Sesiones.Semana2.Hilos.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            int i = 0;
            // Cuando se leen por caracteres los archivos, el ultimo es el -1
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
