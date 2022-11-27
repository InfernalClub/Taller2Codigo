package Contenedores;

import Clases.Jefe;
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

    private Jefe[] jefe;



    /**
     * Constructor de Trabajadores recibe el tamanio maximo
     *
     * @param cantMax tamanio del vector
     */
    public ListaTrabajadores(int cantMax) {
        cantActual = 0;
        Max = cantMax;
        vector = new Trabajadores[Max];
    }

    /**
     * Devuelve el vector de trabajadores
     * @return vector de trabajadores
     */
    public Trabajadores[] getTrabajadores() {
        return vector;
    }
    /**
     * Devuelve la cantidad maxima de trabajadores
     * @return cantidad maxima  de trabajadores
     */
    public int getMax() {
        return Max;
    }

    /**
     * Obtiene la cantidad actual de trabajadores
     * @return cantidad actual de trabajadores
     */
    public int getCantActual() {
        return cantActual;
    }

    /**
     * Intenta agregar un trabajador al vector e incrementa el contador
     * @param trabajador trabajador a agregar
     * @return true en exito, false en caso de que el trabajador sea nulo o el vector está lleno
     */
    public boolean agregarTrabajadores(Trabajadores trabajador){
        if (trabajador== null || cantActual == Max) {
            return false;
        }
        vector[cantActual] = trabajador;
        cantActual++;
        return true;

    }

    /**
     * Busca un trabajador en el vector
     * @param rut a buscar
     * @return el trabajador buscado o null en caso de que no se encuentre
     */
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

    /**
     * Devuelve el trabajador en la posicion dada
     * @param posicion del trabajador a obtener
     * @return posicion del trabajador dado
     */
    public Trabajadores obtenerTrabajador(int posicion)
    {
        if (posicion < 0 || posicion >= this.getCantActual())
        {
            return null;
        }
        return this.vector[posicion];
    }

    /**
     * Devuelve al jefe en la posicion dada
     * @param posicion del jefe a obtener
     * @return posicion del jefe dado
     */
    public Jefe obtenerJefe(int posicion)
    {
        if (posicion < 0 || posicion >= this.getCantActual())
        {
            return null;
        }
        return this.jefe[posicion];
    }



}


