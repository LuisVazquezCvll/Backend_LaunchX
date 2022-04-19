package Sesiones.Semana2.Lunes;

abstract class Hola{
    //Estrictamente no permite que nada se implemente aquí mismo.
    void saludar(){
        System.out.println("Hola hola");
    }

    abstract void saludo();
}

interface Mostrar{
    //Da por hecho que todo lo aquí implementado es abstracto
    //Que hace
    void show();
    abstract void despide();
}

public class SaludsCordiales implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola, ¿qué tal?");
    }

    @Override
    public void despide() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        SaludsCordiales saludo1 = new SaludsCordiales();
        saludo1.show();

    }
}
