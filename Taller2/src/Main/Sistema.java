package Main;

import java.io.IOException;
import java.text.ParseException;

public interface Sistema {
    /**
     * Carga los datos de los archivos de texto e inicia el sistema
     * @throws Exception si no se puede cargar los datos
     */
     void Iniciar() throws Exception;
    /**
     * Menu principal del sistema
     */
    void menuPrincipal();
    /**
     * Menu de empleados del sistema
     */
     void menuEmpleados();
    /**
     * Menu de departamentos del sistema
     */
     void menuDepartamentos();

     void verEmpleados();
    /**
     * Metodo que muestra todos los departamentos
     *
     * @return
     */
     String[] TodosLosDepartamentos();

    /**
     * Metodo que ingresa a un empleado al sistema
     * @return retorna verdadero si su ingreso fue correcto y falso si es que ya existia
     * @throws ParseException si es que no puede cargar los datos
     */
    boolean IngresarEmpleado() throws ParseException;
    /**
     * Ingresa los departamentos al sistema
     */
    boolean IngresarDepartamento();
    /**
     * Permite saber que jefe fue asignado a un departamento en especifico
     */
    void departamentoSegunJefe();
    /**
     * Departamento que posee la mayor cantidad de empleados
     */
    public void departamentoMasEmpleados();
    /**
     * Departamento que posee la menor cantidad de empleados
     */
    public void departamentoMenosEmpleados();
    /**
     * Orden de departamentos segun su rango de bonos
     */
    public void departamentoSegunRangoDeBonos();
    /**
     * Jefe con la mayor cantidad de departamentos asignados
     */
    public void jefeMasDepartamentos();

    /**
     * Orden de empleados segun su departamento
     */
    public void empleadosSegunDepartamento();
    /**
     * Orden de empleados segun su rango de inicio
     */
    public void empleadosSegunRangoDeInicio();
    /**
     * Orden de empleados segun su jefe asignado
     */
    public void empleadosSegunJefatura();
    /**
     * Orden de empleados segun su sueldo
     */
    public void empleadosSegunRangoDeSueldo();
    /**
     * Orden de empleados segun su rango de edad
     */
    public void empleadosSegunRangoEdad();
    /**
     * Empleado que posee el mayor sueldo
     */
    public void empleadoMayorSueldo();
    /**
     * Empleado que posee el menor sueldo
     */
    public void empleadoMenorSueldo();
    /**
     * Menu de estadisticas del sistema
     */
    public void Estadisticas();

    /**
     * Metodo que escribe los archivos en un archivo txt
     * @throws IOException si no se puede cargar los datos
     */
    public void escribirArchivos() throws IOException;
    /**
     * Verifica si el rut ingresado es valido
     */
    boolean rutValido(String rut);

    /**
     * Metodo que carga los archivos a partir de un documento txt
     * @return retorna verdadero si realizo la carga y falso si no
     * @throws IOException si no se puede cargar los datos
     * @throws ParseException si no se puede realizar la lectura del archivo
     */
    boolean cargarDatos() throws IOException, ParseException;
    /**
     * Metodo que cierra el sistema
     */
    public void Salir();

}
