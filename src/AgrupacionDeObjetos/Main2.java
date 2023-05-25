package AgrupacionDeObjetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String[]> listaMuertesEveres = leerArchivo("C:\\Users\\edchi\\IdeaProjects\\ParadigmasProgramacionII\\src\\AgrupacionDeObjetos\\muertes_everest.txt");

        Scanner scanner = new Scanner(System.in);

        // Mostrar nombre y nacionalidad de aquellas personas que pertenezcan a United Kingdom
        System.out.println("Personas de United Kingdom");
        listaMuertesEveres.parallelStream()
                .filter(muerte -> muerte[4].equals("United Kingdom"))
                .forEach(muerte -> System.out.printf("  Nombre: %s, Nacionalidad: %s%n", muerte[0], muerte[4]));
        imprimirRenglon();

        // Mostrar nombre y edad de aquellas personas cuya edad esté entre 18 y 21
        System.out.println("Personas entre 18 y 21 años");
        listaMuertesEveres.parallelStream()
                .filter(muerte -> Double.parseDouble(muerte[2]) >= 18 && Double.parseDouble(muerte[2]) <= 21)
                .forEach(muerte -> System.out.printf("  Nombre: %s, Edad: %s%n", muerte[0], muerte[2]));
        imprimirRenglon();

        // Mostrar nombre y edad de las personas que no sean menores a los 50 años
        System.out.println("Personas que no sean menores a los 50 años");
        listaMuertesEveres.parallelStream()
                .filter(muerte -> !(Double.parseDouble(muerte[2]) < 50))
                .forEach(muerte -> System.out.printf("  Nombre: %s, Edad: %s%n", muerte[0], muerte[2]));
        imprimirRenglon();

        // Mostrar nombre, edad y nacionalidad de las personas que tengan 25 años o que sean de nacionalidad mexicana (Mexican)
        System.out.println("Personas de nacionalidad mexicana o que tengan 25 años");
        listaMuertesEveres.parallelStream()
                .filter(muerte -> muerte[4].equals("Mexican") || Double.parseDouble(muerte[2]) == 25)
                .forEach(muerte -> System.out.printf("  Nombre: %s, Edad: %s, Nacionalidad: %s%n", muerte[0], muerte[2], muerte[4]));
        imprimirRenglon();

        // Pedir una letra y mostrar nombre y causa de muerte de las personas cuyos nombres empiecen con esa letra
        System.out.println("Introduce una letra en mayusculas para mostrar personas cuyos nombres empiecen con esa letra:");
        String letra = scanner.nextLine();
        System.out.printf("Personas cuyos nombres empiezan con %s:%n", letra);
        List<String[]> personasFiltradas = listaMuertesEveres.parallelStream()
                .filter(muerte -> muerte[0].startsWith(letra))
                .collect(Collectors.toList());

        for (String[] muerte : personasFiltradas) {
            System.out.printf("  Nombre: %s, Causa de muerte: %s%n", muerte[0], muerte[5]);
        }
        imprimirRenglon();

        // Mostrar nombre y causa de muerte de todas las personas en orden ascendente según causa de muerte
        System.out.println("Personas por causa de muerte (orden ascendente):");
        List<String[]> personasOrdenadas = listaMuertesEveres.parallelStream()
                .sorted(Comparator.comparing(muerte -> muerte[5]))
                .collect(Collectors.toList());

        personasOrdenadas.forEach(muerte -> System.out.printf(" Nombre: %s,   Causa de muerte: %s%n", muerte[0], muerte[5]));

        imprimirRenglon();
    }

    public static List<String[]> leerArchivo(String rutaArchivo) {
        List<String[]> listaMuertesEveres = null;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            listaMuertesEveres = br.lines()
                    .map(linea -> linea.split("\\|"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaMuertesEveres;
    }

    public static void imprimirRenglon() {
        System.out.println(" ");
        System.out.println("**************************************************************************************************************************");
    }
}
