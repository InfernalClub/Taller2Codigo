package Contenedores;

import Clases.Trabajadores;

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
    public boolean buscarTrabajador(String rut) {
        if (rut == null) {
            return false;
        }
        for (int i = 0; i < cantActual; i++) {
            if (vector[i].getRut().equalsIgnoreCase(rut)) {
                return true;
            }
        }
        return false;
    }




}


