public class prueba {
    public static void main(String[] args) {
        double v = 0.0; // velocidad inicial
        double m = 80.0; // masa
        double b = 15.0; // coeficiente de arrastre
        double g = 9.8; // aceleración debido a la gravedad
        double dt = 0.01; // paso de tiempo
        double t = 0.0; // tiempo inicial

        while (v < 43.24) { // cuando la velocidad alcanza la del primer saltador en t = 9 s
            double a = (m * g - b * v) / m; // calcular la aceleración
            v = v + a * dt; // calcular la velocidad usando el método de Euler
            t = t + dt; // avanzar el tiempo por el paso de tiempo
        }

        System.out.println("El segundo saltador alcanza la misma velocidad en t = " + t + " segundos.");
    }
}
