package Ejecucion_Hilos;

public class HilosContadoresPrueba {
    public static void main(String[] args){
        Thread cuentaAtras = new Thread(new ContadorAtras("Contador--"));
        cuentaAtras.start();

        Thread cuentaAdelante = new Thread(new ContadorAdelante("Contador++"));
        cuentaAdelante.start();
    }
}