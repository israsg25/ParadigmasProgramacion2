package AgrupacionDeObjetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String[]> listaMuertesEveres = leerArchivo("C:\\Users\\edchi\\IdeaProjects\\ParadigmasProgramacionII\\src\\AgrupacionDeObjetos\\muertes_everest.txt");

        // Agrupar a las personas por nacionalidad
        System.out.println("Personas por nacionalidad");
        Map<String, List<String[]>> agrupadoPorNacionalidad =
                listaMuertesEveres.stream()
                        .collect(Collectors.groupingBy(muerte -> muerte[4]));

        agrupadoPorNacionalidad.forEach(
                (nacionalidad, muertesEnNacionalidad) -> {
                    System.out.println("\n" + nacionalidad);
                    muertesEnNacionalidad.forEach(
                            muerte -> System.out.printf("  Nombre: %s, Fecha: %s, Edad: %s%n", muerte[0], muerte[1], muerte[2]));
                }
        );
        imprimirRenglon();

        // Agrupar a las personas por causa de muerte
        System.out.println("Personas por causa de muerte");
        Map<String, List<String[]>> agrupadoPorCausaMuerte =
                listaMuertesEveres.stream()
                        .collect(Collectors.groupingBy(muerte -> muerte[5]));

        agrupadoPorCausaMuerte.forEach(
                (causaMuerte, muertesPorCausaMuerte) -> {
                    System.out.println("\n" + causaMuerte);
                    muertesPorCausaMuerte.forEach(
                            muerte -> System.out.printf("  Nombre: %s, Fecha: %s, Edad: %s%n", muerte[0], muerte[1], muerte[2]));
                }
        );
        imprimirRenglon();

        // Agrupar a las personas por ubicación
        System.out.println("Personas por ubicación");
        Map<String, List<String[]>> agrupadoPorUbicacion =
                listaMuertesEveres.stream()
                        .collect(Collectors.groupingBy(muerte -> muerte[6]));

        agrupadoPorUbicacion.forEach(
                (ubicacion, muertesEnUbicacion) -> {
                    System.out.println("\n" + ubicacion);
                    muertesEnUbicacion.forEach(
                            muerte -> System.out.printf("  Nombre: %s, Fecha: %s, Edad: %s%n", muerte[0], muerte[1], muerte[2]));
                }
        );
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