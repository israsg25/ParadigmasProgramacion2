package hilos;

public class Metodos implements Runnable {

        @Override
        public void run() {

            ArticuloMinorista Articulos1 = new ArticuloMinorista("Articulo no. 01", "Chaqueta", 12, 59.95);
            ArticuloMinorista Articulos2 = new ArticuloMinorista("Articulo no. 02", "Jeans de diseñador", 40, 34.95);
            ArticuloMinorista Articulos3 = new ArticuloMinorista("Articulo no. 03", "Camisa ", 20, 24.95);

            System.out.println(Articulos1.toString());
            System.out.println(Articulos2.toString());
            System.out.println(Articulos3.toString());
        }
}
