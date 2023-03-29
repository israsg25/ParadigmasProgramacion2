package Tarea;
//Eduardo Israel Chimal Casimiro ICO-26
import java.util.Arrays;

public class CalificacionesDoubleStream {

    public static void main(String[] args) {

        double[] calificaciones = {3.2, 10.0, 6.7, 5.1, 4.6, 7.8, 8.2, 7.5, 5.8, 8.7};

        // Imprimir las calificaciones originales
        System.out.println("Calificaciones originales: ");
        Arrays.stream(calificaciones).forEach(System.out::println);

        // Promedio de aquellos que pasaron
        double promedio = Arrays.stream(calificaciones)
                .filter(cal -> cal >= 6.0)
                .average()
                .getAsDouble();
        System.out.println("Promedio de aquellos que pasaron: " + promedio);

        // Número de alumnos reprobados
        long reprobados = Arrays.stream(calificaciones)
                .filter(cal -> cal < 6.0)
                .count();
        System.out.println("Número de alumnos reprobados: " + reprobados);

        // Calificación máxima de los que están entre 6.0 y 8.0
        double maxCalEntre6y8 = Arrays.stream(calificaciones)
                .filter(cal -> cal >= 6.0 && cal <= 8.0)
                .max()
                .getAsDouble();
        System.out.println("Calificación máxima de los que están entre 6.0 y 8.0: " + maxCalEntre6y8);

        // Calificación mínima de los que están entre 4.0 y 6.0
        double minCalEntre4y6 = Arrays.stream(calificaciones)
                .filter(cal -> cal >= 4.0 && cal < 6.0)
                .min()
                .getAsDouble();
        System.out.println("Calificación mínima de los que están entre 4.0 y 6.0: " + minCalEntre4y6);

        // Sumar un punto a todos y mostrarlos
        System.out.println("Calificaciones con un punto adicional: ");
        Arrays.stream(calificaciones)
                .map(cal -> cal + 1.0)
                .forEach(System.out::println);
    }
}
