package Contenedores;

import Clases.Departamento;
import Clases.Jefe;
import Clases.Trabajadores;

public class ListaDepartamento {
    /**
     * vector que contiene los departamentos
     */
    private final Departamento[] vector;
    /**
     * cantidad de departamentos en el vector
     */
    private int cantActual;
    /**
     * tamanio del vector
     */
    private final int cantMax;
    /**
     * Jefe asignado al departamento
     */
    private Trabajadores[] trabajador;



    /**
     * Contructor de departamentos que recibe un tamanio maximo
     * @param maximo tamanio del vector
     */
    public ListaDepartamento(int maximo) {
        cantActual = 0;
        cantMax = maximo;
        vector = new Departamento[cantMax];
    }
    /**
     * Devuelve el vector de departamentos
     * @return vector de departamentos
     */
    public Departamento[] getVector() {
        return vector;
    }
    /**
     * Devuelve la cantidad actual de departamentos
     * @return cantidad actual de trabajadores
     */
    public int getCantActual() {
        return cantActual;
    }
    /**
     * Devuelve la cantidad maxima de departamentos
     * @return cantidad maxima de departamentos
     */
    public int getCantMax() {
        return cantMax;
    }


    /**
     * Intenta agregar un departamento e incrementa el vector
     * @param departamentos a agregar
     * @return true en exito, false en caso de que el departamento sea nulo o el vector este lleno
     */
    public boolean agregarDepartamento(Departamento departamentos) {
            if (departamentos == null || cantActual == cantMax) {
                return false;
            }
            vector[cantActual] = departamentos;
            cantActual++;
            return true;

    }

    /**
     *  Intenta obtener la posicion del departamento en la lista
     * @param posicion a obtener
     * @return true si se encuentra, false si es que no
     */

    public Departamento obtenerDepartamento(int posicion)
    {
        if(posicion < 0 || posicion >= this.cantActual){
            return null;
        }
        return this.vector[posicion];
    }



}
