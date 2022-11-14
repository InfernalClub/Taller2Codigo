package Main;

import Clases.Departamento;

import java.io.IOException;
import java.text.ParseException;

public interface Sistema {
     void iniciar() throws Exception;
     void menuPrincipal();
     void menuEmpleados();
     void menuDepartamentos();
     void verEmpleados();
     void verDepartamentos();
    boolean IngresarEmpleado();
    boolean IngresarDepartamento();
    void departamentoSegunJefe();
    public String[] departamentoMasEmpleados();
    public String[] departamentoMenosEmpleados();
    public String[] jefeMasDepartamentos(int cantDepartamentos);


    public String[] empleadosSegunDepartamento(Departamento departamento);

    public String[] empleadosSegunRangoDeInicio(String rango);
    public String[] empleadosSegunJefatura();
    public String[] empleadosSegunRangoDeSueldo(int sueldo);
    public String[] empleadosSegunEdad(int edad);
    public String[] empleadoMayorSueldo(int menor);
    public String[] empleadoMenorSueldo(int mayor);
    public void Estadisticas();
    public void escribirArchivos();

    boolean rutValido(String rut);

    boolean cargarDatos() throws IOException, ParseException;

    public void Salir();

}
