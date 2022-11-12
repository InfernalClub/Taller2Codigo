import ucn.StdIn;
import ucn.StdOut;

public class SistemaImpl implements Sistema {
    /**
     * Lista de trabajadores
     */
    private static ListaTrabajadores listaTrabajadores;
    /**
     * Lista de Departamentos
     */
    private static ListaDepartamento listaDepartamento;


    public SistemaImpl(int maximo) {
        listaTrabajadores = new ListaTrabajadores (maximo);
        listaDepartamento = new ListaDepartamento(maximo);
    }

    @Override
    public void iniciar() {
        if (!cargarClientes() || !cargarVehiculos() || !cargarContratos()) {
            StdOut.println("No se pudo iniciar el programa");
            return;
        }
        menuPrincipal();
    }

    @Override
    public void menuPrincipal() {
        StdOut.println("***************************");
        StdOut.println("Menu Principal");
        StdOut.println("");
        StdOut.println("[1] Ver Trabajadores");
        StdOut.println("[2] Ver Departamentos");
        StdOut.println("[3] Ingresar nuevo empleado");
        StdOut.println("[4] Ingresar nuevo departamento");
        StdOut.println("[5] Estadisticas");
        StdOut.println("[6] Salir");
        StdOut.println("");
        StdOut.println("***************************");
        try {
            String opaux = StdIn.readLine();
            int opcion;
            if (isNumeric(opaux)) Integer.parseInt(opaux);
            opcion = Integer.parseInt(opaux);
            switch (opcion) {
                case 1:
                    verEmpleados();
                    break;
                case 2:
                    verDepartamentos();
                    break;
                case 3:
                    if (IngresarEmpleado()) {
                        IngresarEmpleado();
                    } else {
                        menuPrincipal();
                    }
                    break;
                case 4:
                    if(IngresarDepartamento()){
                        IngresarDepartamento();
                    }else {
                        menuPrincipal();
                    }
                    break;
                case 5:
                    if (Esta)
                case 6:
                    guardarDatos();
                    StdOut.println("Se cierra el programa");
                    StdOut.println("Gracias por utilizar nuestros servicios");
                    System.exit(0);
                    break;
                default:
                    StdOut.println("Ingrese una opción válida.");
                    menuPrincipal();
            }
        } catch (Exception e) {
            StdOut.println("Ingrese una opción válida.");
            menu();
        }
    }

    @Override
    public void menuEmpleados() {
        StdOut.println("***************************");
        StdOut.println("Menu Empleados");
        StdOut.println("");
        StdOut.println("[1] Empleados Segun Departamento");
        StdOut.println("[2] Empleados Segun Rango De Inicio");
        StdOut.println("[3] Empleados Segun Jefatura");
        StdOut.println("[4] Empleados Segun Rango De Sueldo");
        StdOut.println("[5] Empleados Segun Rango De Edad");
        StdOut.println("[6] Volver Al Menu Anterior");
        StdOut.println("");
        StdOut.println("***************************");
    }

    @Override
    public void menuDepartamentos() {
        StdOut.println("***************************");
        StdOut.println("Menu Departamentos");
        StdOut.println("");
        StdOut.println("[1] Todos Los Departamentos");
        StdOut.println("[2] Departamentos Segun Jefe");
        StdOut.println("[3] Departamentos Segun Rango De Bonos");
        StdOut.println("[4] Volver Al Menu Anterior");
        StdOut.println("");
        StdOut.println("***************************");
    }

    @Override
    public void verEmpleados() {

    }

    @Override
    public void verDepartamentos() {

    }

    @Override
    public boolean IngresarEmpleado() {
        return false;
    }

    @Override
    public boolean IngresarDepartamento() {
        return false;
    }

    @Override
    public void departamentoSegunJefe() {

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
    public String[] jefeMasDepartamentos(int cantDepartamentos) {
        return new String[0];
    }

    @Override
    public String[] empleadosSegunDepartamento() {
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
    public String[] empleadoMayorSueldo(int mayor) {
        return new String[0];
    }

    @Override
    public String[] empleadoMenorSueldo(int menor) {
        return new String[0];
    }

    @Override
    public void Estadisticas() {
        StdOut.println("***************************");
        StdOut.println("Estadisticas");
        StdOut.println("");
        StdOut.println("[1] Empleado con Mayor Sueldo");
        StdOut.println("[1] Empleado con Menor Sueldo");
        StdOut.println("[1] Departamento con mas empleados");
        StdOut.println("[1] Departamento con menos empleados");
        StdOut.println("[1] Jefes con mas departamentos");
        StdOut.println("");
        StdOut.println("***************************");
    }

    private boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public void escribirArchivos() {

    }

    @Override
    public void Salir() {

    }
}
