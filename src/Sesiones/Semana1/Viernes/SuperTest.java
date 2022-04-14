package Sesiones.Semana1.Viernes;

class Animal{
    // Caso 1
    String color = "Blanco";

    // Caso 2
    void eat(){
        System.out.println("El animal está comiendo");
    }

    Animal(){
        System.out.println("Se crea un nuevo animal");
    }
}

class Gato extends Animal{
    String color = "Naranja";

    void prinColor(){
        System.out.println("Color del gato: " + color);
        System.out.println("Color del animal: " + super.color);
    }

    void eat(){
        System.out.println("El gato está comiendo");
    }

    void sleep(){
        System.out.println("Michi dormido");
    }

    void call(){
        super.eat();
        sleep();
    }

    // Caso 3
    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        // Caso 1
        //new Gato().prinColor();

        // Caso 2
        //new Gato().call();

        // Caso 3
        new Gato();
    }

}
