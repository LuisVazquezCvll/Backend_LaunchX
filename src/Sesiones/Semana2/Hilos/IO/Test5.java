package Sesiones.Semana2.Hilos.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\buffer.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            String s = "Hola, viajeros de \n Inovaccion Virtual";
            byte b[] = s.getBytes();

            bout.write(b);
            bout.flush();

            bout.close();
            fos.close();
            System.out.println("Ready");
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
