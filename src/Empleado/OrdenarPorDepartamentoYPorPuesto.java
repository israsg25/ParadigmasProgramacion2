package Empleado;


import java.util.Comparator;

public class OrdenarPorDepartamentoYPorPuesto implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2) {
        // Primero comparamos el departamento
        if (empleado1.getDepartamento().compareTo(empleado2.getDepartamento()) !=0){
            return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());
        }
        // si los departamentos son iguales, entonces comparamos el puesto
        if(empleado1.getPuesto().compareTo(empleado2.getPuesto()) !=0){
            return empleado1.getPuesto().compareTo(empleado2.getPuesto());
        }

        return 0;
    }
}