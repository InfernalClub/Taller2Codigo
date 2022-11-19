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

    private Jefe jefe;

    public ListaDepartamento(int maximo) {
        cantActual = 0;
        cantMax = maximo;
        vector = new Departamento[cantMax];
    }

    public Departamento[] getVector() {
        return vector;
    }

    public int getCantActual() {
        return cantActual;
    }

    public int getCantMax() {
        return cantMax;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public boolean agregarDepartamento(Departamento departamentos) {
            if (departamentos == null || cantActual == cantMax) {
                return false;
            }
            vector[cantActual] = departamentos;
            cantActual++;
            return true;

    }

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
