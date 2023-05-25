package hilos;

public class ArticuloMinorista {
    private String articulo;
    private String descripcion;
    private int unidadesDisponibles;
    private double precio;

    public ArticuloMinorista(String articulo, String descripcion, int unidadesDisponibles, double precio){

        this.articulo = articulo;
        this.descripcion = descripcion;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
    }
    public String getArticulo(){
        return articulo;
    }
    public void setArticulo(String articulo){
        this.articulo = articulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descrpcion){
        this.descripcion = descrpcion;
    }
    public int getUnidadesDisponibles(){
        return unidadesDisponibles;
    }
    public void setUnidadesDisponibles(int unidadesDisponibles){
        this.unidadesDisponibles = unidadesDisponibles;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Articulo{" + "Articulo = '" + articulo + '\'' +
                ", Descripcion = " + descripcion +
                ", Unidades Disponibles = '" + unidadesDisponibles + '\''
                + ", Precio= '" + precio + '\'' + '}';
    }
}
