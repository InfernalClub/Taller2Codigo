package Contenedores;

import Clases.Departamento;
import Clases.Jefe;

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
    private Jefe jefe;

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
     * Devuelve el jefe asignado al departamento
     * @return jefe asignado al departamento
     */
    public Jefe getJefe() {
        return jefe;
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
     * Intenta buscar un departamento de acuerdo a su jefe asignado
     * @param nombre a buscar
     * @return true en exito, false en caso de que el nombre sea nulo o el vector este lleno
     */
    public Departamento buscarDepartamentoSegunJefe(String nombre) {
        if (nombre == null) {
            return null;
        }
        for (int i = 0; i < cantActual; i++) {
            if (vector[i].getNombre().equalsIgnoreCase(nombre)) {
                return vector[i];//
            }
        }
        return null;
    }
    /**
     * Intenta buscar un departamento de acuerdo a su rango de bono
     * @param bono a buscar
     * @return true en exito, false en caso de que el bono sea nulo o el vector este lleno
     */
    public Departamento buscarDepartamentoSegunRangoBono(int bono) {
            if (bono==0) {
                return null;
            }
            for (int i = 0; i < cantActual; i++) {
                if (vector[i].getBono()==bono) {
                    return vector[i];
                }
            }
            return null;

    }




}
