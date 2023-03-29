package Empleado;



import java.util.Comparator;

public class OrdenarPorDepartamentoYPorSalario implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        // Primero comparamos el departamento
        if (empleado1.getDepartamento().compareTo(empleado2.getDepartamento()) != 0) {
            return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
        }
        // si los departamentos son iguales, entonces comparamos el salario

        if (empleado1.getSalario() == empleado2.getSalario()) {
            return 0;
        } else if (empleado1.getSalario() > empleado2.getSalario()) {
            return 1;
        } else {
            return -1;
        }

    }
}