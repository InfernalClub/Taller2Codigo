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

    /**
     * Metodo que muestra todos los departamentos
     *
     * @return
     */
     String TodosLosDepartamentos(int i);

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
     void departamentoMasEmpleados();
    /**
     * Departamento que posee la menor cantidad de empleados
     */
     void departamentoMenosEmpleados();
    /**
     * Orden de departamentos segun su rango de bonos
     */
    void departamentoSegunRangoDeBonos();
    /**
     * Jefe con la mayor cantidad de departamentos asignados
     */
    void jefeMasDepartamentos();
    /**
     * Orden de empleados segun su departamento
     */
    void empleadosSegunDepartamento();
    /**
     * Orden de empleados segun su rango de inicio
     */
     void empleadosSegunRangoDeInicio();
    /**
     * Orden de empleados segun su jefe asignado
     */
    void empleadosSegunJefatura();
    /**
     * Orden de empleados segun su sueldo
     */
    void empleadosSegunRangoDeSueldo();
    /**
     * Orden de empleados segun su rango de edad
     */
    void empleadosSegunRangoEdad();
    /**
     * Empleado que posee el mayor sueldo
     */
     void empleadoMayorSueldo();
    /**
     * Empleado que posee el menor sueldo
     */
    void empleadoMenorSueldo();

    /**
     * Menu de estadisticas del sistema
     */
    void Estadisticas();
    /**
     * Metodo que escribe los archivos en un archivo txt
     * @throws IOException si no se puede cargar los datos
     */
    void escribirArchivos() throws IOException;
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
    void Salir();

}
