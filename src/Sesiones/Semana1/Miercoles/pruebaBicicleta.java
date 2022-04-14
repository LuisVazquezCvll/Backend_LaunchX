package Sesiones.Semana1.Miercoles;

public class pruebaBicicleta {
    public static void main(String[] args) {
        def();
    }
    public static void def() {
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Roja");
        biciMountain.setPins(4);
        biciMountain.setRodada(16);
        biciMountain.setVelocidad(20.5);

        String msg = "Soy una bici con las sig caracteristicas:";
        msg += "\nColor : " + biciMountain.getColor();
        msg += "\nVelocidad : " + biciMountain.getVelocidad();
        msg += "\nPines : " + biciMountain.getPins();
        msg += "\nRodada : " + biciMountain.getRodada();

        System.out.print(msg);
    }

}
