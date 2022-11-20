package Main;

import Clases.Departamento;

import java.io.IOException;
import java.text.ParseException;

public interface Sistema {
     void Iniciar() throws Exception;



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
    public void departamentoSegunRangoDeBonos();
    public void jefeMasDepartamentos();


    public void empleadosSegunDepartamento();

    public void empleadosSegunRangoDeInicio();
    public void empleadosSegunJefatura();
    public void empleadosSegunRangoDeSueldo();
    public void empleadosSegunEdad();
    public void empleadoMayorSueldo();
    public void empleadoMenorSueldo();
    public void Estadisticas();
    public void escribirArchivos() throws IOException;

    boolean rutValido(String rut);

    boolean cargarDatos() throws IOException, ParseException;

    public void Salir();

}
