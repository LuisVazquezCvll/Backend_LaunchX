package Sesiones.Semana2.Lunes;

abstract class Sombra{
    // Solo te dice que va a hacer, pero no como lo hacer. Al definirla abstracta, esta asume que en otro lugar definiras
    //Su funcionamiento
    abstract void dibujarSombra();
}

class Arma extends Sombra{
    void dibujarSombra(){
        System.out.println("Dibujando sombras en el arma azules");
    }
}

public class Personaje extends Arma{
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    @Override
    void dibujarSombra() {
        System.out.println("Dibujando sombra blanca");
    }
}
