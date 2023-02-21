package Practicas.Actividades;
import java.util.ArrayList;
import java.util.Scanner;

public class LenguajesDeProgramacionMenu {
    public static void main(String[] args) {
        ArrayList<String> listaLenguajesProgramacion = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("==== Menú ====");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Añadir elemento al final");
            System.out.println("3. Añadir elemento al principio");
            System.out.println("4. Mostrar lista de lenguajes");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lenguaje: ");
                    String lenguaje = input.next();
                    listaLenguajesProgramacion.add(lenguaje);
                    break;
                case 2:
                    System.out.print("Ingrese el lenguaje: ");
                    String lenguajeF = input.next();
                    listaLenguajesProgramacion.add(listaLenguajesProgramacion.size(), lenguajeF);
                    break;
                case 3:
                    System.out.print("Ingrese el lenguaje: ");
                    String lenguajeI = input.next();
                    listaLenguajesProgramacion.add(0, lenguajeI);
                    break;
                case 4:
                    System.out.println("Lista de lenguajes:");
                    for (String lenguaje2 : listaLenguajesProgramacion) {
                        System.out.println(lenguaje2);
                    }
                    break;
                case 5:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);
    }

}
