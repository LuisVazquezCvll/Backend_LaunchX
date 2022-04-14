package Sesiones.Semana1.Viernes;

class Bike2{
    void run(){
        System.out.println("Running...");
    }
}

public class Polimorfismo extends Bike2{
    @Override
    void run() {
        System.out.println("Running at 60mph");
    }

    public static void main(String[] args) {
        // Objeto de tipo Bike2, construido con base en clase Polimorfismo
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}
