package VideoJuegos;

public class Videojuego {
    private int indice;
    private String titulo;
    private String plataforma;
    private int anio;
    private String genero;
    private String publisher;
    private int ventasNA;
    private int ventasEU;
    private int ventasJP;
    private int ventasGlobales;

    public Videojuego(int indice, String titulo, String plataforma, int anio, String genero, String publisher, int ventasNA, int ventasEU, int ventasJP, int ventasGlobales) {
        this.indice = indice;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.anio = anio;
        this.genero = genero;
        this.publisher = publisher;
        this.ventasNA = ventasNA;
        this.ventasEU = ventasEU;
        this.ventasJP = ventasJP;
        this.ventasGlobales = ventasGlobales;
    }

    public int getIndice() {
        return indice;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getAnio() {
        return anio;
    }

    public String getGenero() {
        return genero;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getVentasNA() {
        return ventasNA;
    }

    public int getVentasEU() {
        return ventasEU;
    }

    public int getVentasJP() {
        return ventasJP;
    }

    public int getVentasGlobales() {
        return ventasGlobales;
    }
}

