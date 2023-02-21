package Practicas.Actividades;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PruebaList{
    public static void main(String[] args){
        // Agrega varios colores a lista1
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("negro");
        lista1.add("amarillo");
        lista1.add("verde");
        lista1.add("azul");
        lista1.add("violeta");
        lista1.add("plateado");

        // Agrega varios colores a lista2
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("dorado");
        lista2.add("blanco");
        lista2.add("cafe");
        lista2.add("azul");
        lista2.add("gris");
        lista2.add("plateado");

        //Concatenar las dos listas
        lista1.addAll(lista2);
        //Libera los recursos de lista2
        lista2 = null;
        imprimirLista(lista1);

        //Convierte cada elemento de lista a mayusculas
        convertitCadenasAMayusculas(lista1);
        imprimirLista(lista1); //limpiar elementos de lista1

        System.out.printf("%nEliminando elementos 4 a 6...");
        eliminarElementos(lista1, 4, 7); // elimina los elementos 4 a 6 de la lista
        imprimirLista(lista1); //imprime los elementos de la lista
        imprimeListaInversa(lista1); //imprime la lista en orden inverso
    }// fin del main

    private static void imprimirLista(LinkedList<String> lista){
        System.out.printf("%nlista:%n");
        for (String color : lista){
            System.out.printf("%s ", color);
        }
        System.out.println();
    }// fin de imprimirLista

    // localiza los objetivos string y los convierte en mayusculas
    private static void convertitCadenasAMayusculas(LinkedList<String> lista){
        ListIterator<String> iterator = lista.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next(); //obtiene el elemento
            iterator.set(color.toUpperCase()); // Convierte a mayusculas
        }
    }// fin de convertirCadenasAMayusculas
    // obtener una sublista y utulizar el metodo  clear para eliminar los elementos de la misma
    private static void eliminarElementos(List<String> lista, int inicio, int fin){
        lista.subList(inicio, fin).clear(); // elñiminar los elementos
    }
    // imprime la lista inversa
    private static void imprimeListaInversa(List<String> lista){
        ListIterator<String> iterator = lista.listIterator(lista.size());
        System.out.printf("%nLista inversa:%n");
        //imprime la lista en orden inverso
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }
}
