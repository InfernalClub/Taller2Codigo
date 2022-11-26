package Clases;

/**
 * Clase que representa al Departamento
 */
public class Departamento {
    /**
     * Id asignada al departamento
     */
    String ID;
    /**
     * Nombre asignado al departamento
     */
    String nombre;
    /**
     * Bono asignado al departamento
     */
    int Bono;
    /**
     * Rut del jefe asignado al departamento
     */
    String rutJefe;
    /**
     * Cantidad de empleados del departamento
     */
    int cant_Empleados;

    /**
     * Constructor del Departamento
     * @param ID Id asignada al departamento
     * @param nombre nombre asignado al departamento
     * @param bono bono asignado al departamento
     * @param rutJefe rut del jefe asignado al departamento
     * @param cant_Empleados cantidad de empleados que posee el departamento
     */
    public Departamento(String ID, String nombre, int bono, String rutJefe, int cant_Empleados) {
        this.ID = ID;
        this.nombre = nombre;
        this.Bono = bono;
        this.rutJefe = rutJefe;
        this.cant_Empleados = cant_Empleados;
    }

    /**
     * Getters y Setters
     */

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
