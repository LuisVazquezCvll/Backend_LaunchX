package Sesiones.Semana1.Viernes;

public class Employee {
    double salario = 40000;
}

class Programmer extends Employee{
    int bono = 1000;

    public void main(){
        Programmer Luis = new Programmer();
        System.out.println("Salary is " + Luis.salario);
        System.out.println("Bonus is " + Luis.bono);
    }

    void mensaje(){
        System.out.println("I am a programmer");
        main();
    }
}

class Web extends Programmer{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}