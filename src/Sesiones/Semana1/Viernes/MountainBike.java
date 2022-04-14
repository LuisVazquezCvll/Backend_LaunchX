package Sesiones.Semana1.Viernes;

public class MountainBike {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Bike b = new Bike("Azul", 6);

        System.out.println("Color de la bicicleta de Montaña: " + b.getColor());
        System.out.println("Velocidad de la bicicleta de Montaña: " + b.getVelocidad());
    }
}
