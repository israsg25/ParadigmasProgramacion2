package Apuntes;

import Apuntes.Persona;
import java.util.Comparator;

public class ComparadorEdadNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2){
        //Primero vamos a comparar la edad
        if(persona1.getEdad() > persona2.getEdad()){
            return 1;
        } else if (persona1.getEdad() < persona2.getEdad()){
            return -1;
        }
        // Si las edades son iguales, entonces comparar el nombre
        return persona1.getNombre().compareTo(persona2.getNombre());

    }

}
