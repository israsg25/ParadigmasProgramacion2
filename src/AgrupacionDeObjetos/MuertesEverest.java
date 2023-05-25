package AgrupacionDeObjetos;

public class MuertesEverest {
    private String nombre;
    private String fecha;
    private int edad;
    private String expedicion;
    private String nacionalidad;
    private String causaDeMuerte;
    private String ubicacion;

    public MuertesEverest(String nombre, String fecha, int edad, String expedicion, String nacionalidad, String causaDeMuerte, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.edad = edad;
        this.expedicion = expedicion;
        this.nacionalidad = nacionalidad;
        this.causaDeMuerte = causaDeMuerte;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(String expedicion) {
        this.expedicion = expedicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCausaDeMuerte() {
        return causaDeMuerte;
    }

    public void setCausaDeMuerte(String causaDeMuerte) {
        this.causaDeMuerte = causaDeMuerte;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
