package Apuntes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] palos= {"Corazones", "Diamantes", "Bastos", "Espadas"};


        // Crea y muestra una lista que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desordenados: %s%n", lista);

        Collections.sort(lista); // ordena la lista
        System.out.printf("Elementos ordenados: %s%n", lista);

        // ordena de forma descendente usando un comparador
        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos ordenados de forma descendente: %s%n", lista);
    }
}