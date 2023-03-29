package Empleado;



import java.util.Comparator;

public class OrdenarPorDepartamento implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empleado1, Empleado empleado2){
        return empleado1.getDepartamento().compareTo(empleado2.getDepartamento());

    }
}

