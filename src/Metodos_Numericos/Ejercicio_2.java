package Metodos_Numericos;

import java.lang.Math;

public class Ejercicio_2 {
    public static void main(String[] args) {
        double x = 1.5;
        double valorVerdadero = Math.sin(x);
        double aproximacion = 0.0;
        double error = 0.0;
        int n = 15;

        for (int i = 0; i < n; i++) {
            double termino = Math.pow(-1, i) * Math.pow(x, 2*i+1) / factorial(2*i+1);
            aproximacion += termino;
            error = (valorVerdadero - aproximacion / valorVerdadero) * 100;
            System.out.printf("Termino %d: %.10f, Aproximacion: %.10f, Error: %.2f%% \n---------------------------------" +
                    "-------------------------------------\n", i+1, termino, aproximacion, error);
        }
        System.out.printf("Valor verdadero: %.10f", valorVerdadero);
    }

    // Función para calcular el factorial de un número
    public static double factorial(int n) {
        double factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

