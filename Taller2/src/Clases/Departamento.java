package Clases;

public class Departamento {
    String ID;
    String nombre;
    int Bono;
    String rutJefe;
    int cant_Empleados;

    public Departamento(String ID, String nombre, int bono, String rutJefe, int cant_Empleados) {
        this.ID = ID;
        this.nombre = nombre;
        this.Bono = bono;
        this.rutJefe = rutJefe;
        this.cant_Empleados = cant_Empleados;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBono() {
        return Bono;
    }

    public void setBono(int bono) {
        Bono = bono;
    }

    public String getRutJefe() {
        return rutJefe;
    }

    public void setRutJefe(String rutJefe) {
        this.rutJefe = rutJefe;
    }

    public int getCant_Empleados() {
        return cant_Empleados;
    }

    public void setCant_Empleados(int cant_Empleados) {
        this.cant_Empleados = cant_Empleados;
    }
}