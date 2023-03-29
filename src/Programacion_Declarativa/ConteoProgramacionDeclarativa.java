package Programacion_Declarativa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConteoProgramacionDeclarativa {

    public static void main(String[] args) {
        Double[] numeros = {2.4, 55.6, 90.12, 26.6, 100.0};
        Set<Double> conjuntoNumeros = new HashSet<>(Arrays.asList(numeros));
        long conteo=conjuntoNumeros.stream().filter(num -> num > 60).count();
        System.out.println("Total de calores mayores a 60: " + conteo);

    }
}

