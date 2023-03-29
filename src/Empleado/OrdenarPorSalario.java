package Empleado;


import java.util.Comparator;

public class OrdenarPorSalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado1, Empleado empleado2){
        if (empleado1.getSalario() == empleado2.getSalario()) {
            return 0;
        } else if (empleado1.getSalario() > empleado2.getSalario()) {
            return 1;
        } else {
            return -1;
        }
    }
}