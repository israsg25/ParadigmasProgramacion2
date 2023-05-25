package Practicas.ContadorDePalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDePalabras {
    public static void main(String[] args) {
        Map<String, Integer> frecuencias = new HashMap<>();
        try {
            File archivo = new File("C:\\Users\\edchi\\IdeaProjects\\ParadigmasProgramacionII\\src\\Practicas\\ContadorDePalabras\\melville-moby_dick.txt");
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                linea = linea.replaceAll("[^a-zA-Z ]", "").toLowerCase(); // omitir los signos de puntuación y convertir a minúsculas
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    if (palabra.length() > 0) { // omitir las palabras vacías
                        if (frecuencias.containsKey(palabra)) {
                            frecuencias.put(palabra, frecuencias.get(palabra) + 1);
                        } else {
                            frecuencias.put(palabra, 1);
                        }
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        }
        for (String palabra : frecuencias.keySet()) {
            System.out.println(palabra + ": " + frecuencias.get(palabra));
        }
    }
}
