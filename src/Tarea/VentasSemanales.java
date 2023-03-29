package Tarea;

import java.util.Arrays;
import java.util.stream.IntStream;

public class VentasSemanales {
    public static void main(String[] args) {
        int[] ventas = {5, 5686, 3010, 1568, 8059, 5277, 9124};

        System.out.println("Ventas de la semana: " + Arrays.toString(ventas));

        long ventasSuperioresA1000 = IntStream.of(ventas).filter(v -> v > 1000).count();
        System.out.println("Ventas superiores a $1000: " + ventasSuperioresA1000);

        int totalVentas = IntStream.of(ventas).sum();
        System.out.println("Total de ventas: $" + totalVentas);

        int ventaMaxima1000a2000 = IntStream.of(ventas)
                .filter(v -> v >= 1000 && v <= 2000)
                .max().orElse(0);
        System.out.println("Venta máxima en el rango de $1000 a $2000: $" + ventaMaxima1000a2000);

        int ventaMinima0a5000 = IntStream.of(ventas)
                .filter(v -> v >= 0 && v <= 5000)
                .min().orElse(0);
        System.out.println("Venta mínima en el rango de $0 a $5000: $" + ventaMinima0a5000);

        double promedioVentas = IntStream.of(ventas).average().getAsDouble();
        System.out.println("Promedio de ventas: $" + promedioVentas);
    }
}
