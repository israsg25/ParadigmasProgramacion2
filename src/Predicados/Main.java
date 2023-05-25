package Predicados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Luis", "Perez", 20));
        listaPersonas.add(new Persona("Armando", "Sanchez", 30));
        listaPersonas.add(new Persona("Luis", "Blanco", 40));
        listaPersonas.add(new Persona("Felipe", "Blanco", 70));

        // -------------------------------------- Recorremos la lista por medio de streams

        System.out.println("Mostrando datos de todas las personas");
        imprimirEncabezado();
        listaPersonas.parallelStream()
                .forEach(p -> System.out.println(p.toString()));
        imprimirRenglon();

        //--------- Este flujo tiene un filtro como los que se han ocupado anteriormente
        System.out.println("Mostrando apellidos de aquellos que se llaman Armando");
        listaPersonas.parallelStream()
                .filter(p -> p.getNombre().equals("Armando"))
                .forEach(p -> System.out.println(p.getApellidos()));
        imprimirRenglon();

        // ----------------------------------------
        System.out.println("Mostrando apellidos de aquellos que se llaman Luis");
        //Creamos primero un predicado que se encargue de definir
        // una condicion que permita filtrar una lista
        Predicate<Persona> predicadoNombre = persona ->
                persona.getNombre().equals("Luis");
        listaPersonas.parallelStream()
                .filter(predicadoNombre)
                .forEach(p -> System.out.println(p.getApellidos()));
        imprimirRenglon();

        //--------------------------------------------

        System.out.println("Mayores de 18 años y menores de 30");
        Predicate<Persona> edadMayor18 = p -> p.getEdad() > 18;
        Predicate<Persona> edadMenor30 = p -> p.getEdad() < 30;
        // Usar el metodo and
        Predicate<Persona> edadMayor18AndMenor30 = edadMayor18.and(edadMenor30);
        imprimirEncabezado();
        listaPersonas.parallelStream()
                .filter(edadMayor18AndMenor30)
                .forEach(p -> System.out.println(p.toString()));
        imprimirRenglon();

        //--------------------------------------------------

        System.out.println("Mayores de 65 años o menores de 30");
        Predicate<Persona> edadMayor65 = p -> p.getEdad() > 63;
        // Usar el metodo or
        Predicate<Persona> edadMayor65orMenor30 = edadMayor65.or(edadMenor30);
        imprimirEncabezado();
        listaPersonas.parallelStream()
                .filter(edadMayor65orMenor30)
                .forEach(p -> System.out.println(p.toString()));
        imprimirRenglon();

        //-----------------------------------------------------

        System.out.println("No mayores de 40 años");
        Predicate<Persona> edadMayor40 = p -> p.getEdad() > 40;
        // Usar el metodo negate
        Predicate<Persona> edadNoMayor40 = edadMayor40.negate();
        imprimirEncabezado();
        listaPersonas.parallelStream()
                .filter(edadNoMayor40)
                .forEach(p -> System.out.println(p.toString()));
        imprimirRenglon();
        //----------------------------------------------------------

        // Ejercico
        System.out.println("Personas que se llamen Luis o que tengan mas de 50 años");
        listaPersonas.parallelStream()
                .filter(p -> p.getNombre().equals("Luis") || p.getEdad() > 50)
                .map(Persona::getNombre)
                .forEach(p -> System.out.println(p.toString()));

    }
    public static void imprimirEncabezado() {
        System.out.printf("%15s%15s%5s%n", "Nombre", "Apellidos", "Edad");
        System.out.println("-------------------------------------------");
    }
    public static void imprimirRenglon(){
        System.out.println();
        System.out.println("--------------------------------------------");;


    }
}