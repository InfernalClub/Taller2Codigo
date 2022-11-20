package Clases;

import Clases.Departamento;

import java.util.Calendar;

public class Jefe extends Trabajadores {
    Departamento departamento;
    int cant_Departamentos;
    String DepartamentoAsignado;

    public Jefe(String nombre, String apellido, String rut, Calendar edad, int sueldo, Calendar fechaIngreso,int bono, int cant_Departamentos)
    {
        super(nombre, apellido, rut, edad, sueldo, fechaIngreso, bono);


    }


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
