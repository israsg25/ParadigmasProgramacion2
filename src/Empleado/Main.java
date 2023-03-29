package Empleado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleado = new ArrayList<>();
        listaEmpleado.add(new Empleado("García Carlos", 47899, "contabilidad", "Vicepresidente", 3000));
        listaEmpleado.add(new Empleado("López Juan", 39119, "TI", "Programador", 1500));
        listaEmpleado.add(new Empleado("Morales Carolina", 81774, "fabricacion", "Ingeniero", 4500));
        listaEmpleado.add(new Empleado("Sanchez Gabriel", 58946, "Ventas", "Gerente", 4000));
        listaEmpleado.add(new Empleado("Herra Paulina", 36978, "Ventas", "Vendedor", 3000));
        listaEmpleado.add(new Empleado("Herra Ilzen", 48946, "Servicios", "Ingeniero", 4000));
        listaEmpleado.add(new Empleado("Dias Luis", 23586, "Contabilidad", "Contador", 3000));
        listaEmpleado.add(new Empleado("Alcantara Alex", 12358, "TI", "Programador", 1600));
        listaEmpleado.add(new Empleado("Mora Yess", 68987, "Servicios", "Gerente", 5000));
        listaEmpleado.add(new Empleado("Ruperto Ximena", 96378, "fabricacion", "Ingeniero", 50000));
        listaEmpleado.add(new Empleado("Ruiz Diego", 23951, "Ventas", "Vendedor", 3000));
        listaEmpleado.add(new Empleado("Pacheco Denisse", 37915, "TI", "Programador", 1700));


        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("Selecciona una opción de ordenamiento:");
            System.out.println("1. Ordenar por salario.");
            System.out.println("2. Ordenar por departamento.");
            System.out.println("3. Ordenar por departamento y por puesto.");
            System.out.println("4. Ordenar por departamento y por salario.");
            System.out.println("5. Salir.");
            System.out.println("Digiete la opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Collections.sort(listaEmpleado, new OrdenarPorSalario());
                    System.out.println("Elementos de la lista ordenados por salario: ");
                    listaEmpleado.forEach(empleado -> System.out.println(empleado));
                    System.out.println();
                    break;
                case 2:
                    Collections.sort(listaEmpleado, new OrdenarPorDepartamento());
                    System.out.println("Elementos de la lista ordenados por departamento: ");
                    listaEmpleado.forEach(empleado -> System.out.println(empleado));
                    System.out.println();
                    break;
                case 3:
                    Collections.sort(listaEmpleado, new OrdenarPorDepartamentoYPorPuesto());
                    System.out.println("Elementos de la lista ordenados por departamento y por puesto: ");
                    listaEmpleado.forEach(empleado -> System.out.println(empleado));
                    System.out.println();
                    break;
                case 4:
                    Collections.sort(listaEmpleado, new OrdenarPorDepartamentoYPorSalario());
                    System.out.println("Elementos de la lista ordenados por departamento y por salario: ");
                    listaEmpleado.forEach(empleado -> System.out.println(empleado));
                    System.out.println();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }
}
