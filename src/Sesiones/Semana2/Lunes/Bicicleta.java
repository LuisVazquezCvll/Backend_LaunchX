package Sesiones.Semana2.Lunes;

abstract class Mountain{
    Mountain (){
        System.out.println("Bicicleta de montaña creada");
    }

    abstract void cambiarVelocidad();

    void cambiarColor(){
        System.out.println("Color cambiado");
    }
}


class Magistroni extends Mountain{
    void cambiarVelocidad(){
        System.out.println("Se desbloquean las perillas del manubrio.");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
