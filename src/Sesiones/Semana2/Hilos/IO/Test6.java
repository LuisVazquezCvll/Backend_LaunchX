package Sesiones.Semana2.Hilos.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\buffer.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            while ((i=bis.read())!=-1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
