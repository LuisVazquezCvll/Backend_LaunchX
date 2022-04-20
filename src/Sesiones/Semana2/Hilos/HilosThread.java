package Sesiones.Semana2.Hilos;

public class HilosThread extends Thread{

    @Override // Runnable
    public void run() {
        System.out.println("El hilo se está ejecutando");
    }

    /*
    public void start(){
      // Inicia la ejecución de un hilo
      // La Java Virtual Machine llama al metodo run() del hilo
    }

    sleep - Detiene de manera temporal el número especificado de milisegundos
    join() - Espera a que el hilo se muera para entrar
    getPriority - Regresa la prioridad dle hilo+
    setPriority - Establece la prioridad del hilo
    getName - Devuelve el nombre dle hilo
    currentThread - Referencia al hilo que se está ejecutando
    getId - Regresa el id del hilo
    Thread.State getState - Regresa el estado en el que está el hilo
    isAlive - Revisa si el hilo sigue vivo.


    public static void main(String[] args) {
        HilosThread hilo = new HilosThread(); //Entra a state New
        hilo.start();
    }
    */
}


class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable está corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);  // Thread contiene el método start.
        t.start();
    }
}