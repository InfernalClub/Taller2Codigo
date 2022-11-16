package Contenedores;

import Clases.Trabajadores;

public class ListaTrabajadores
{
    Trabajadores trabajadores[];
    int cantMax;
    int cantActual;

    public ListaTrabajadores(int cantMax) {
        cantActual=0;
        cantMax=999;
    }

    public Trabajadores[] getTrabajadores() {
        return trabajadores;
    }

    public int getCantMax() {
        return cantMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public boolean agregarTrabajadores(Trabajadores rut){
        return true;
    }

    boolean buscarTrabajadorMayorSueldo(int Sueldo){
        return true;
    }

    boolean buscarTrabajadorMenorSueldo(int Sueldo){
        return true;
    }

    boolean buscarJefeMayorCantDepartamentos(int cant_Departamentos){
        return true;
    }

    public boolean buscarTrabajador(String rut) {
        for (int i = 0; i < cantActual; i++) {
            if (trabajadores[i].getRut().equals(rut)) {
                return true;
            }
        }
    return true;
    }


}
