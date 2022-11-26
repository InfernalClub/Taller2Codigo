package Clases;

import Clases.Departamento;

import java.util.Calendar;

/**
 *  Clase que reperesenta al jefe
 */
public class Jefe extends Trabajadores {
    /**
     * Departamento asiganado al jefe
     */
    Departamento departamento;
    /**
     * cantida de departamentos que posee un jefe
     */
    int cant_Departamentos;
    /**
     * Departamento que se le asigno a un jefe
     */
    String DepartamentoAsignado;

    /**
     * Constructor de Jefe
     * @param nombre nombre del jefe
     * @param apellido apellido del jefe
     * @param rut rut del jefe
     * @param edad edad del jefe
     * @param sueldo sueldo del jefe
     * @param fechaIngreso fecha de ingreso del jefe
     * @param bono bono del jefe
     * @param cant_Departamentos cantidad de departamentos del jefe
     */
    public Jefe(String nombre, String apellido, String rut, String edad, int sueldo, String fechaIngreso,int bono, int cant_Departamentos)
    {
        super(nombre, apellido, rut, edad, sueldo, fechaIngreso, bono);


    }

    /**
     * Getters y Setters
     */

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getCant_Departamentos() {
        return cant_Departamentos;
    }

    public void setCant_Departamentos(int cant_Departamentos) {
        this.cant_Departamentos = cant_Departamentos;
    }

    public String getDepartamentoAsignado() {
        return DepartamentoAsignado;
    }

    public void setDepartamentoAsignado(String departamentoAsignado) {
        DepartamentoAsignado = departamentoAsignado;
    }
}
