public interface Sistema {
    public void iniciar();
    public void menuPrincipal();
    public void menuEmpleados();
    public void menuDepartamentos();
    public void verEmpleados();
    public void verDepartamentos();
    public boolean IngresarEmpleado();
    public boolean IngresarDepartamento();
    public void departamentoSegunJefe();
    public String[] departamentoMasEmpleados();
    public String[] departamentoMenosEmpleados();
    public String[] jefeMasDepartamentos(int cantDepartamentos);
    public String[] empleadosSegunDepartamento();
    public String[] empleadosSegunRangoDeInicio(String rango);
    public String[] empleadosSegunJefatura();
    public String[] empleadosSegunRangoDeSueldo(int sueldo);
    public String[] empleadosSegunEdad(int edad);
    public String[] empleadoMayorSueldo(int menor);
    public String[] empleadoMenorSueldo(int mayor);
    public void Estadisticas();
    public void escribirArchivos();
    public void Salir();

}
