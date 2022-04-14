package Sesiones.Semana1.Viernes;
/*
Overload (Sobrecarga):
Overrride (Redefine):
Overwrite (Sobrescribir):
*/
public class Bike {
    //Propiedades
    private int velocidad;
    private String color, marca;

    // Sobrecargando el constructor: Definiendo casos en los que recibe diferentes datos.
    public Bike(){}

    public Bike(String color){this.color = color;}

    public Bike(String color, int velocidad){
        this.color = color;
        this.velocidad = velocidad;
    }

    public Bike(String color, String marca, int velocidad){
        this.color = color;
        this.velocidad = velocidad;
        this.marca = marca;
    }

    //getters
    public int getVelocidad(){return velocidad;}
    public String getColor(){return color;}
    public String getMarca(){return marca;}
}
