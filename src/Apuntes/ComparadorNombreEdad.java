package Apuntes;


import Apuntes.Persona;

import java.security.PublicKey;
import java.util.Comparator;

public class ComparadorNombreEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        // Primero comparamos el nombre
        if (persona1.getNombre().compareTo(persona2.getNombre()) !=0){
            return persona1.getNombre().compareTo(persona2.getNombre());
        }
        // si los nombre son iguales, entonces comparamos la edad
        if(persona1.getEdad() == persona2.getEdad()){
            return 0;
        } else if (persona1.getEdad()> persona2.getEdad()){
            return 1;
        } else {
            return -1;
        }
    }
}
