package hilos.Dormido;

public class Frases {
    public static void main(String[] args) {
        String frase1 = "Preguntarse cuándo los ordenadores podrán pensar es como " + "\n" +
                "preguntarse cuándo los submarinos podrán nadar.";
        String autorFrase1 ="-- Edsger W. Dijkstra";
        String frase2 = "No importa lo estupendamente que haya ido la demo en " + "\n" +
                "los ensayos, cuando lo haces frente a tu audencia la " + "\n" +
                "probabilidad de que sea una presentación exitosa es " + "\n" +
                "inveramente proporcional al número de personas mirando, " + "\n" +
                "elevando a la cantidad de dinero que hay en el juego " + "\n" +
                "--Mark Gibbs";

        EscrituraLenta.escribir(frase1, 20);
        EscrituraLenta.escribir(autorFrase1, 400);
        System.out.println();
        EscrituraLenta.escribir("------------------------", 200);
        EscrituraLenta.escribir(" ", 200);
        System.out.println();
        EscrituraLenta.escribir(frase2, 10);
    }
}
