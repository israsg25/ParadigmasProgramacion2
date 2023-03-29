package FlujosArreglos;

import java.util.stream.IntStream;

public class OperacionesIntStream {
    public static void main(String[] args) {
        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        //valores originales
        System.out.print("Valores originales: ");
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        //cuenta, min, max, suma y promedio de los valores
        System.out.printf("Cuenta: %d", IntStream.of(valores).count());
        imprimirLinea();
        System.out.printf("Mínimo: %d", IntStream.of(valores).min().getAsInt());
        imprimirLinea();
        System.out.printf("Máximo: %d", IntStream.of(valores).max().getAsInt());
        imprimirLinea();
        System.out.printf("Suma: %d", IntStream.of(valores).sum());
        imprimirLinea();
        System.out.printf("Promedio: %.2f",
                IntStream.of(valores).average().getAsDouble());
        imprimirLinea();

        //suma de los valores con el método reduce
        System.out.printf("Suma mediante reduce: %d", IntStream.of(valores)
                .reduce(0, (x, y) -> x + y));
        imprimirLinea();

        //suma de los cuadrados de los valores con el método reduce
        System.out.printf("Suma de los cuadrados mediante reduce: %d",
                IntStream.of(valores).reduce(0, (x, y) -> x + y * y));
        imprimirLinea();

        //producto de los valores con el método reduce
        System.out.printf("Producto de los valores mediante reduce: %d",
                IntStream.of(valores).reduce(1, (x, y) -> x * y));
        imprimirLinea();

        //valores pares mostrados en orden
        System.out.println("Valores mostrados en orden: ");
        IntStream.of(valores).filter(valor -> valor % 2 == 0)
                .sorted().forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        //valores impares multiplicados por 10 y mostrados en orden
        System.out.println("Valores impares multiplicados por 10 y mostrados en orden: ");
        IntStream.of(valores).filter(valor -> valor % 2 != 0)
                .map(valor -> valor * 10).sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        //suma el rango de enteros del 1 al 10, exclusivo
        System.out.printf("Suma de enteros del 1 al 9: %d",
                IntStream.range(1, 10).sum());
        imprimirLinea();

        //suma el rango de enteros del 1 al 10, inclusivo
        System.out.printf("Suma de enteros del 1 al 10: %d",
                IntStream.rangeClosed(1, 10).sum());
        imprimirLinea();
    }
    public static void imprimirLinea(){
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
    }
}

