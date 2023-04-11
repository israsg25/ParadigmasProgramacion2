package Tarea;
// Eduardo Israel Chimal Casimiro

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int anioNacimieto;
    private int salario;
    private double coeficiente;

    public Persona(int id, String nombre, String apellido, int anioNacimieto,
                   int salario, double coeficiente){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimieto = anioNacimieto;
        this.salario = salario;
        this.coeficiente = coeficiente;
    }
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getAnioNacimieto() {
        return anioNacimieto;
    }

    public int getSalario() {
        return salario;
    }

    public double getCoeficiente() {
        return coeficiente;
    }
}
