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
    boolean IngresarEmpleado() throws ParseException;
    boolean IngresarDepartamento();
    void departamentoSegunJefe();
    public void departamentoMasEmpleados();
    public void departamentoMenosEmpleados();
    public void jefeMasDepartamentos(int cantDepartamentos);


    public void empleadosSegunDepartamento(Departamento departamento);

    public void empleadosSegunRangoDeInicio(String rango);
    public void empleadosSegunJefatura();
    public void empleadosSegunRangoDeSueldo(int sueldo);
    public void empleadosSegunEdad(int edad);
    public void empleadoMayorSueldo(int menor);
    public void empleadoMenorSueldo(int mayor);
    public void Estadisticas();
    public void escribirArchivos() throws IOException;

    boolean rutValido(String rut);

    boolean cargarDatos() throws IOException, ParseException;

    public void Salir();

}
