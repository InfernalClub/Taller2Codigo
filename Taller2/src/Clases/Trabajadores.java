package Clases;

import Clases.Departamento;

import java.util.Calendar;

public abstract class Trabajadores {
    String nombre;
    String apellido;
    String rut;
    Calendar fechaNacimiento;
    int sueldo;
    Calendar fechaInicio;
    int bono;

    public Trabajadores(String nombre, String apellido, String rut, Calendar fechaNacimiento, int sueldo, Calendar fechaInicio, int bono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
        this.fechaInicio = fechaInicio;
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Calendar getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Calendar getfechaInicio() {
        return fechaInicio;
    }

    public void setfechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int departamento) {
        this.bono = bono;
    }
}
