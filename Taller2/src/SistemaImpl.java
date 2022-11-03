public class SistemaImpl implements Sistema {
    ListaDepartamento listaDepartamento;
    ListaTrabajadores listaTrabajadores;


    @Override
    public void verEmpleados() {
        
    }

    @Override
    public void verDepartamentos() {

    }

    @Override
    public boolean IngresarEmpleado(String nombre, String apellido, String rut, String fechaIngreso, String fechaNacimiento, int salario, int bonoProductividad) {
        return false;
    }

    @Override
    public boolean IngresarDepartamento(String nombre, int bono, int cant_Empleados) {
        return false;
    }

    @Override
    public void departamentoSegunJefe(Jefe jefe) {

    }

    @Override
    public String[] departamentoMasEmpleados() {
        return new String[0];
    }

    @Override
    public String[] departamentoMenosEmpleados() {
        return new String[0];
    }

    @Override
    public String[] jefeMasDepartamentos(int cant_Actual) {
        return new String[0];
    }

    @Override
    public String[] empleadosSegunDepartamento(Departamento departamento) {
        return new String[0];
    }

    @Override
    public String[] empleadosSegunRangoDeInicio(String rango) {
        return new String[0];
    }

    @Override
    public String[] empleadosSegunJefatura() {
        return new String[0];
    }

    @Override
    public String[] empleadosSegunRangoDeSueldo(int sueldo) {
        return new String[0];
    }

    @Override
    public String[] empleadosSegunEdad(int edad) {
        return new String[0];
    }

    @Override
    public String[] empleadoMayorSueldo() {
        return new String[0];
    }

    @Override
    public String[] empleadoMenorSueldo() {
        return new String[0];
    }

    @Override
    public void escribirArchivos() {

    }

    @Override
    public void Salir() {

    }
}
