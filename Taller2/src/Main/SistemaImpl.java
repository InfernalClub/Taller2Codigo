package Main;

import Clases.*;
import Contenedores.ListaDepartamento;
import Contenedores.ListaTrabajadores;
import Main.Sistema;
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
        StdOut.println("[1] Ver Clases.Trabajadores");
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
        StdOut.println("[1] Empleados Segun Clases.Departamento");
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
        StdOut.println("[2] Departamentos Segun Clases.Jefe");
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
        StdOut.println("[1] Clases.Empleado con Mayor Sueldo");
        StdOut.println("[1] Clases.Empleado con Menor Sueldo");
        StdOut.println("[1] Clases.Departamento con mas empleados");
        StdOut.println("[1] Clases.Departamento con menos empleados");
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
    public boolean IngresarEmpleado()
    {
        StdOut.println ("Ingrese el rut del empleado: ");
        String rut = StdIn.readLine();


        StdOut.println ("Ingrese el nombre del empleado: ");
        String nombre = StdIn.readLine();

        StdOut.println ("Ingrese la fecha de nacimiento: ");
        String fecha = StdIn.readLine();


        StdOut.println ("Ingrese el salario del empreado: ");
        int salario = Integer.parseInt(StdIn.readLine());











        return true;
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
    @Override
    public boolean rutValido(String rut) {
        try {
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);
            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            char dvCalculado = (char) (s != 0 ? s + 47 : 75);

            return dvCalculado == dv;

        } catch (NumberFormatException excepcion) {
            return false;
        }
    }

    /**
     * Verificador del formato del rut
     * Comprueba si el rut ingresado tiene el formato correcto
     * Ejemplo: 12345678-9
     *
     * @param rut rut a verificar
     * @return true si el rut tiene el formato correcto, false si no lo es
     */

    private boolean rutFormato(String rut)
    {
        if (rut.length() == 10 || rut.length() == 12)
        {
            if (rut.length() == 10)
            {
                if (rut.charAt(8) == '-')
                {
                    if (Character.isDigit(rut.charAt(0)) && Character.isDigit(rut.charAt(1)) && Character.isDigit(rut.charAt(2)) && Character.isDigit(rut.charAt(3)) && Character.isDigit(rut.charAt(4)) && Character.isDigit(rut.charAt(5)) && Character.isDigit(rut.charAt(6)) && Character.isDigit(rut.charAt(7)) && Character.isDigit(rut.charAt(9)))
                    {
                        return true;
                    }
                    else
                    {
                        StdOut.println("Ingrese un rut válido");
                        return false;
                    }
                }
                else
                {
                    StdOut.println("Ingrese un rut válido");
                    return false;
                }
            }
            else
            {
                if (rut.charAt(2) == '.' && rut.charAt(6) == '.' && rut.charAt(10) == '-')
                {
                    if (Character.isDigit(rut.charAt(0)) && Character.isDigit(rut.charAt(1)) && Character.isDigit(rut.charAt(3)) && Character.isDigit(rut.charAt(4)) && Character.isDigit(rut.charAt(5)) && Character.isDigit(rut.charAt(7)) && Character.isDigit(rut.charAt(8)) && Character.isDigit(rut.charAt(9)) && Character.isDigit(rut.charAt(11)))
                    {
                        return true;
                    }
                    else
                    {
                        StdOut.println("Ingrese un rut válido");
                        return false;
                    }
                }
                else
                {
                    StdOut.println("Ingrese un rut válido");
                    return false;
                }
            }
        }
        return true;
    }
    private String rutFormateado(String rut)
    {
        String rutFormateado = "";
        if (rut.length() == 8)
        {
            rutFormateado = rut.substring(0, 1) + "." + rut.substring(1, 4) + "." + rut.substring(4, 7) + "-" + rut.substring(7, 8);
        }
        else
        {
            rutFormateado = rut.substring(0, 2) + "." + rut.substring(2, 5) + "." + rut.substring(5, 8) + "-" + rut.substring(8, 9);
        }
        return rutFormateado;
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
            //Clases.Departamento departamento = new Clases.Departamento(ID,nombredepa,bonoDepa,rutjefe,cantEmpleados);
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
                //Clases.Empleado empleado = new Clases.Empleado(nombre, apellido,rut, diaDeNacimiento, salario, fechaIngreso, bonoProductividad, ID)
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
