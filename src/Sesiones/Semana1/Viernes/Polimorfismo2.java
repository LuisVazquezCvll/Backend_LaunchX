package Sesiones.Semana1.Viernes;

import javax.security.auth.callback.CallbackHandler;

class Animal2{
    void eat(){
        System.out.println("Comiendo2...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("El lomo está comiendo croquetas");
    }
}

class Cachorro extends Animal{
    void eat(){
        System.out.println("El lomito está tomando awa");
    }
}


public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal dander;
        dander = new Animal();
        dander.eat();

        dander = new Dog();
        dander.eat();

        dander = new Cachorro();
        dander.eat();
    }

}
