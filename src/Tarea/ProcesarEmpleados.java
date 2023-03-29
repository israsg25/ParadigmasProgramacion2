package Tarea;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ProcesarEmpleados {
    private static final String NOMBRE_ARCHIVO_EMPLEADOS = "empleados.txt";
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Empleado("José", "García", 5000, "TI"),
                new Empleado("Rosario", "Vázquez", 7600, "TI"),
                new Empleado("Luis", "Prieto", 10000, "TI"),
                new Empleado("Luis", "Vázquez", 4500, "Ventas"),
                new Empleado("Gabriela", "Prieto", 6000, "Ventas"),
                new Empleado("Vianney", "Rodríguez", 65000, "Marketing"),
                new Empleado("Francisco", "Vázquez", 50000, "Marketing"),
                new Empleado("Irma", "Dominguez", 7500, "Ventas"),
                new Empleado("Rosario", "Prieto", 100000, "Marketing")
        };
        // Guardar la lista de empleados en un archivo de texto
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO_EMPLEADOS))) {
            for (Empleado empleado : empleados) {
                bw.write(empleado.toString());
                bw.newLine();
            }
            System.out.println("Se ha guardado la lista de empleados en el archivo " + NOMBRE_ARCHIVO_EMPLEADOS);
        } catch (IOException e) {
            System.out.println("Error al guardar la lista de empleados en el archivo " + NOMBRE_ARCHIVO_EMPLEADOS);
            e.printStackTrace();
        }
        List<Empleado> listaEmpleados = Arrays.asList(empleados);

        // Muestra a todos los empleados
        System.out.println("Lista completa de empleados");
        imprimirEncabezado();
        listaEmpleados.stream().forEach(System.out::println);
        imprimirRenglon();

        // 1. Muestra a todos los empleados cuyo apellido sea Vázquez
        System.out.println("\nEmpleados con apellido Vázquez");
        imprimirEncabezado();
        listaEmpleados.stream()
                .filter(e -> e.getApellidoPaterno().equals("Vázquez"))
                .forEach(System.out::println);
        imprimirRenglon();

        // 2. Suma de todos los salarios de los empleados
        double sumaSalarios = listaEmpleados.stream()
                .mapToDouble(e -> e.getSalario())
                .sum();
        System.out.println("\nLa suma de todos los salarios de los empleados es: $" + sumaSalarios);

        // 3. Suma de todos los salarios de los empleados cuyo salario sea mayor o igual a $10,000
        double sumaSalariosMayor10000 = listaEmpleados.stream()
                .filter(e -> e.getSalario() >= 10000)
                .mapToDouble(e -> e.getSalario())
                .reduce(0, Double::sum);
        System.out.println("\nLa suma de todos los salarios de los empleados cuyo salario es mayor o igual a $10,000 es: $" + sumaSalariosMayor10000);

        // 4. Muestra los nombres y apellidos de los empleados cuyo departamento sea Marketing
        System.out.println("\nEmpleados del departamento de Marketing");
        imprimirEncabezado();
        listaEmpleados.stream()
                .filter(e -> e.getDepartamento().equals("Marketing"))
                .forEach(e -> System.out.printf("%-12s %-12s %12.2f %12s%n", e.getPrimerNombre(), e.getApellidoPaterno(), e.getSalario(), e.getDepartamento()));
        imprimirRenglon();

        // 5. ¿Cuál es el salario más alto de los que trabajan en TI?
        double salarioMaximoTI = listaEmpleados.stream()
                .filter(e -> e.getDepartamento().equals("TI"))
                .mapToDouble(e -> e.getSalario())
                .max()
                .orElse(0);
        System.out.println("\nEl salario más alto de los que trabajan en TI es: $" + salarioMaximoTI);

        // 6. ¿Cuantos empleados hay en Venta?
        long numEmpleadosVentas = listaEmpleados.stream()
                .filter(e -> e.getDepartamento().equals("Ventas"))
                .count();
        System.out.println("\nHay " + numEmpleadosVentas + " empleados en Ventas");
    }

    public static void imprimirRenglon(){
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public static void imprimirEncabezado(){
        System.out.printf("%-12s %-12s %12s %12s%n", "Nombre", "Apellidos", "Salario", "Departamento");
        imprimirRenglon();
    }
}
