package hilos;

public class Main {
    public static void main(String[] args){
        System.out.println("Lista de Articulos");
        Thread articulos = new Thread(new Metodos());articulos.start();
}

}
