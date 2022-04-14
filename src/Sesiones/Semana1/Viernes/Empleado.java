package Sesiones.Semana1.Viernes;

class Persona{
    int id;
    String nombre;

    Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

// Un empleado es una persona
public class Empleado extends Persona{
    double salario;

    Empleado(int id, String nombre, double salario){
        super(id, nombre);
        this.salario = salario;
    }

    void display(){
        System.out.println(id + " " + nombre + " " + salario);
    }
}

// Clase de prueba
class TestPersonaEmpleado{
    public static void main(String[] args) {
        Empleado e = new Empleado(1, "Luis", 4550.02);
        e.display();
    }
}