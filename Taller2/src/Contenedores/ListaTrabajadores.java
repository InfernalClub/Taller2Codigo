package Contenedores;

import Clases.Departamento;
import Clases.Empleado;
import Clases.Trabajadores;
import ucn.StdIn;
import ucn.StdOut;

import java.util.Calendar;

public class ListaTrabajadores {

    /**
     * vector que contiene a los trabajadores
     */
    private final Trabajadores[] vector;
    /**
     * cantidad de trabajadores en el vector
     */
    private int cantActual;
    /**
     * tamanio del vector
     */
    private final int Max;

    Trabajadores trabajador;

    public ListaTrabajadores(int cantMax) {
        cantActual = 0;
        Max = cantMax;
        vector = new Trabajadores[Max];
    }


    public Trabajadores[] getTrabajadores() {
        return vector;
    }

    public int getMax() {
        return Max;
    }

    public int getCantActual() {
        return cantActual;
    }

    public boolean agregarTrabajadores(Trabajadores trabajador){
        if (vector == null || cantActual == Max) {
            return false;
        }
        vector[cantActual] = trabajador;
        cantActual++;
        return true;

    }

}


