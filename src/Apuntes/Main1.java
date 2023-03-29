package Apuntes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(new Persona("Pedro", "Picapiedra", 40));
        listaPersona.add(new Persona("Pablo", "Mármol", 30));
        listaPersona.add(new Persona("Vilma", "De Picapiedra", 35));
        listaPersona.add(new Persona("Betty", "Mármol", 25));
        listaPersona.add(new Persona("Tony", "Stark", 56));
        listaPersona.add(new Persona("Bella", "Stark", 56));
        listaPersona.add(new Persona("Bella", "Stark", 12));

        // imprime los elementos del objeto list
        System.out.println("Elementos desordenados: ");
        listaPersona.forEach(persona -> System.out.println(persona));
        System.out.println();

        // Ordenamos por edad
        Collections.sort(listaPersona, new ComparadorEdad());
        System.out.println("Elementos de la lista ordenados por edad: ");
        listaPersona.forEach(persona -> System.out.println(persona));
        System.out.println();

        //Ordenamos por nombre
        Collections.sort(listaPersona, new ComparadorNombre());
        System.out.println("Elementos de la lista ordenados por nombre: ");
        listaPersona.forEach(persona -> System.out.println(persona));
        System.out.println();

        //Ordenamos por Apellido
        Collections.sort(listaPersona, new ComparadorApellido());
        System.out.println("Elementos de la lista ordenados por apellido: ");
        listaPersona.forEach(persona -> System.out.println(persona));
        System.out.println();

        //Ordenamos por edad y nombre
        Collections.sort(listaPersona, new ComparadorEdadNombre());
        System.out.println("Elementos de la lista ordenados por edad y nombre: ");
        listaPersona.forEach(persona -> System.out.println(persona));
        System.out.println();

        //Ordenamos por nombre y edad
        Collections.sort(listaPersona, new ComparadorNombreEdad());
        System.out.println("Elementos de la lista ordenados por nombre y edad: ");
        listaPersona.forEach(persona -> System.out.println(persona));
        System.out.println();

    }
}
