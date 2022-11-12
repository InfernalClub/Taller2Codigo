import ucn.ArchivoEntrada;
import ucn.Registro;
import ucn.StdIn;
import ucn.StdOut;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    public void iniciar() throws Exception
    {
        if (!cargarDatos()) {
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
                    if (IngresarEmpleado())
                        {
                            IngresarEmpleado();
                        }
                        else
                        {
                            menuPrincipal();
                        }
                    break;

                case 4:
                    if(IngresarDepartamento())
                    {
                        IngresarDepartamento();
                    }
                    else
                    {
                        menuPrincipal();
                    }
                    break;

                case 5:
                    Estadisticas();
                    break;

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
        }

        catch (Exception e)
            {
                StdOut.println("Ingrese una opción válida.");
                menuPrincipal();
            }
    }


    public void guardarDatos() throws IOException
    {

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
    public void Estadisticas()
    {
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

    private boolean idFormato(String ID)
    {
        if (ID.length() == 7)
        {
            if(Character.isAlphabetic(ID.charAt(0)) && Character.isAlphabetic(ID.charAt(1)) && Character.isAlphabetic(ID.charAt(2)) && ID.charAt(3) =='-' && Character.isDigit(ID.charAt(4)) && Character.isDigit(ID.charAt(5)) && Character.isDigit(ID.charAt(6)))
            {
                return true;
            }
            else
            {
               StdOut.println("Ingrese un ID valido");
               return false;
            }

        }
    return true;
    }



    public boolean cargarDatos() throws IOException, ParseException {
        ArchivoEntrada archivo = new ArchivoEntrada("datos.txt");
        while(!archivo.isEndFile())
        {
            Registro regEnt = archivo.getRegistro();
            String ID = regEnt.getString();
            String nombredepa = regEnt.getString();
            int bonoDepa = regEnt.getInt();
            String rutjefe = regEnt.getString();
            int cantEmpleados = regEnt.getInt();
            //Departamento departamento = new Departamento(ID,nombredepa,bonoDepa,rutjefe,cantEmpleados);
            //listaDepartamento.agregarDepartamento(depatamento);

            for (int i = 1; i <= cantEmpleados; i++)
            {

                String nombre = regEnt.getString();
                String apellido = regEnt.getString();
                String rut = regEnt.getString();
                if (rut.contains(".") || rut.contains("-")) {
                    rut = rut.replace(".", "");
                    rut = rut.replace("-", "");
                }
                String fecha = regEnt.getString();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date date = sdf.parse(fecha);
                Calendar diaDeNacimiento = Calendar.getInstance();
                diaDeNacimiento.setTime(date);

                int salario = regEnt.getInt();

                String fecha2 = regEnt.getString();
                Date date2 = sdf.parse(fecha2);
                Calendar fechaIngreso = Calendar.getInstance();
                fechaIngreso.setTime(date2);

                int bonoProductividad = regEnt.getInt();

                // Considerar si cambiamos el creado de empleados al nuevo formato del documento de texto
                //Empleado empleado = new Empleado(nombre, apellido,rut, diaDeNacimiento, salario, fechaIngreso, bonoProductividad)
                //listaTrabajadores.agregarTrabajadores(empleado);


            }
        }
        archivo.close();
        return true;
    }
    @Override
    public void Salir() {

    }
}
