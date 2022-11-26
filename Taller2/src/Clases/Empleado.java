package Clases;

import Clases.Departamento;

import java.util.Calendar;

/**
 * Clase que representa al Departamento
 */
public class Empleado extends Trabajadores {
    /**
     * Jefe del empleado
     */
      Jefe jefeDepartamento;
    /**
     * Rut del jefe del empleado
     */
    String rutJefe;

    /**
     *Constructor de Empleado
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param rut rut del empleado
     * @param fechaNacimiento fecha de nacimiento del empleado
     * @param sueldo sueldo del empleado
     * @param fechaInicio fecha de inicio del empleado
     * @param bono bonoe del empleado
     * @param rutJefe rut del jefe de acuerdo al empleado
     */
        public Empleado(String nombre, String apellido, String rut, String fechaNacimiento, int sueldo, String fechaInicio, int bono, String rutJefe) {
                super(nombre, apellido, rut, fechaNacimiento, sueldo, fechaInicio, bono);

        }

    /**
     * Getters y Setters
     */
    public Jefe getJefeDepartamento() {
                return jefeDepartamento;
        }

        public void setJefeDepartamento(Jefe jefeDepartamento) {
                this.jefeDepartamento = jefeDepartamento;
        }
}
