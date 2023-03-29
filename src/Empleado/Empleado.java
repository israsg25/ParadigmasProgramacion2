package Empleado;

public class Empleado {
    private String nombre;
    private int idNumero;
    private String departamento;
    private String puesto;
    private double salario;

    public Empleado(String nombre, int idNumero, String departamento, String puesto, double salario) {
        this.nombre = nombre;
        this.idNumero = idNumero;
        this.departamento = departamento;
        this.puesto = puesto;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public int getIdNumero() {
        return idNumero;
    }
    public String getDepartamento(){return departamento;}
    public String getPuesto(){return  puesto;}
    public double getSalario(){return salario;}
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idNumero='" + idNumero + '\'' +
                ", departamento=" + departamento + '\'' +
                ", puesto=" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}


