package Clases;

import java.util.Calendar;

public abstract class Trabajadores {
    String nombre;
    String apellido;
    String rut;
    String fechaNacimiento;
    int sueldo;
    String fechaInicio;
    int bono;

    public Trabajadores(String nombre, String apellido, String rut, String fechaNacimiento, int sueldo, String fechaInicio, int bono) {
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

    public String getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getfechaInicio() {
        return fechaInicio;
    }

    public void setfechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int departamento) {
        this.bono = bono;
    }
}
