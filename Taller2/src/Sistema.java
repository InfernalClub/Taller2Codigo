public interface Sistema {
    public void verEmpleados();
    public void verDepartamentos();
    public boolean IngresarEmpleado(String nombre,String apellido,String rut,String fechaIngreso,String fechaNacimiento,int salario,int bonoProductividad);
    public boolean IngresarDepartamento(String nombre,int bono,int cant_Empleados);
    public void departamentoSegunJefe(Jefe jefe);
    public String[] departamentoMasEmpleados();
    public String[] departamentoMenosEmpleados();
    public String[] jefeMasDepartamentos(int cant_Actual);
    public String[] empleadosSegunDepartamento(Departamento departamento);
    public String[] empleadosSegunRangoDeInicio(String rango);
    public String[] empleadosSegunJefatura();
    public String[] empleadosSegunRangoDeSueldo(int sueldo);
    public String[] empleadosSegunEdad(int edad);
    public String[] empleadoMayorSueldo();
    public String[] empleadoMenorSueldo();
    public void escribirArchivos();
    public void Salir();

}
