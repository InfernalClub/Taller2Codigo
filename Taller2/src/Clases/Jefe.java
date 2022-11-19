package Clases;

import Clases.Departamento;

import java.util.Calendar;

public class Jefe extends Trabajadores {
    Departamento departamento;
    int cant_Departamentos;
    String DepartamentoAsignado;

    public Jefe(String nombre, String apellido, String rut, Calendar edad, int sueldo, Calendar fechaIngreso, Departamento departamento, Departamento departamento1, int cant_Departamentos, String departamentoAsignado,int bono) {
        super(nombre, apellido, rut, edad, sueldo, fechaIngreso, bono);
        this.departamento = departamento1;
        this.cant_Departamentos = 0;
        DepartamentoAsignado = departamentoAsignado;
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
