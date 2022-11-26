package Main;

import Clases.*;
import Contenedores.ListaDepartamento;
import Contenedores.ListaTrabajadores;
import ucn.*;

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
    /**
     * Empleado actual
     */
    private static Empleado empleadoActual;
    /**
     * Jefe Actual
     */
    private static Jefe jefeActual;
    /**
     * Departamento actual
     */
    private static Departamento departamento;
    /**
     * Trabajadores actuales
     */
    private static Trabajadores trabajadores;

    /**
     * Constructor de la clase SistemaImpl
     *
     * @param maximo indica la cantidad maxima de trabajadores y departamentos
     */
    public SistemaImpl(int maximo) {
        listaTrabajadores = new ListaTrabajadores(maximo);
        listaDepartamento = new ListaDepartamento(maximo);
    }


    @Override
    /**
     * Metodo que verifica la lectura de datos e inicia el sistema
     */
    public void Iniciar() throws Exception {
        if (!cargarDatos()) {
            StdOut.println("No se pudo iniciar el programa");
            return;
        }
        menuPrincipal();
    }

    @Override
    /**
     * Menu principal del programa
     */
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
                    menuEmpleados();
                    break;

                case 2:
                    menuDepartamentos();
                    break;

                case 3:
                    if (IngresarEmpleado()) {
                        IngresarEmpleado();
                    } else {
                        menuPrincipal();
                    }
                    break;

                case 4:
                    if (IngresarDepartamento()) {
                        IngresarDepartamento();
                    } else {
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
                    Salir();
                    break;

                default:
                    StdOut.println("Ingrese una opción válida.");
                    menuPrincipal();
            }
        } catch (Exception e) {
            StdOut.println("Ingrese una opción válida.");
            menuPrincipal();
        }
    }


    // Verificar si requiere cambio o borrarlo
    public void guardarDatos() throws IOException
    {

    }

    @Override
    /**
     * Menu con diferentes opciones de acuerdo a los empleados
     */
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


        try
        {
            String opcion = StdIn.readLine();
            int decision;
            if (isNumeric(opcion)) Integer.parseInt(opcion);
            decision = Integer.parseInt(opcion);
            switch (decision)
            {
                case 1:
                    empleadosSegunDepartamento();
                    break;

                case 2:
                    empleadosSegunRangoDeInicio();
                    break;

                case 3:
                    empleadosSegunJefatura();
                    break;

                case 4:
                    empleadosSegunRangoDeSueldo();
                    break;

                case 5:
                    empleadosSegunRangoEdad();
                    break;

                case 6:
                    StdOut.println("Volviendo al menu principal");
                    menuPrincipal();
                    break;

                default:
                    StdOut.println("Ingrese una opcion de la lista: ");
                    menuEmpleados();


            }

        }
        catch (Exception e) {
            StdOut.println("Ingrese una opción válida.");
            menuPrincipal();
        }
    }



    @Override
    /**
     * Menu con diferentes opciones con referencia a los departamentos
     */
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

        try
        {
            String opcion = StdIn.readLine();
            int decision;
            if (isNumeric(opcion)) Integer.parseInt(opcion);
            decision = Integer.parseInt(opcion);
            switch (decision)
            {
                case 1:
                    TodosLosDepartamentos();
                    break;

                case 2:
                    departamentoSegunJefe();
                    break;

                case 3:
                    departamentoSegunRangoDeBonos();
                    break;

                case 4:
                    menuPrincipal();
                    break;

                default:
                    StdOut.println("Ingrese una opcion de la lista: ");


            }

        }
        catch (Exception e) {
            StdOut.println("Ingrese una opción válida.");
            menuPrincipal();
        }
    }

    @Override
    /**
     * Menu que ofrece las estadisticas del programa
     */
    public void Estadisticas() {
        StdOut.println("***************************");
        StdOut.println("Estadisticas");
        StdOut.println("Seleccione una opcion de la lista");
        StdOut.println("[1] Empleado con Mayor Sueldo");
        StdOut.println("[2] Empleado con Menor Sueldo");
        StdOut.println("[3] Departamento con mas empleados");
        StdOut.println("[4] Departamento con menos empleados");
        StdOut.println("[5] Jefes con mas departamentos");
        StdOut.println("[6] Volver al Menu Principal");
        StdOut.println("");
        StdOut.println("***************************");

        try
        {
            String estadistico = StdIn.readLine();
            int valor;
            if (isNumeric(estadistico)) Integer.parseInt(estadistico);
            valor  = Integer.parseInt(estadistico);
            switch (valor)
            {
                case 1:
                    empleadoMayorSueldo();
                    break;

                case 2:
                    empleadoMenorSueldo();
                    break;

                case 3:
                    departamentoMasEmpleados();
                    break;

                case 4:
                    departamentoMenosEmpleados();
                    break;

                case 5:
                    jefeMasDepartamentos();
                    break;

                case 6:
                    menuPrincipal();
                    StdOut.println("Volviendo al menu principal");
                    break;

                default:
                    StdOut.println("Ingrese una opcion de la lista: ");
                    Estadisticas();
            }


        }

        catch (Exception e)
        {
            StdOut.println("Ingrese una opción válida.");
            menuPrincipal();
        }
    }

    @Override
    /**
     * verEmpleados ofrece la informacion de los empleados actuales
     */
    public void verEmpleados() {
        StdOut.println("Datos del empleado");
        StdOut.println("===========================");
        StdOut.println("Nombre y apellido: " + empleadoActual.getNombre() + " " + empleadoActual.getApellido());
        StdOut.println("Rut: " + empleadoActual.getRut());
        StdOut.println("Edad: " + empleadoActual.getfechaNacimiento());
        StdOut.println("Fecha de Inicio: " + empleadoActual.getfechaInicio());
        StdOut.println("Nombre y apellido del jefe: " + jefeActual.getNombre() + " " + jefeActual.getApellido());
        StdOut.println("Clases.Departamento del empleado: " + departamento.getNombre());

    }

    @Override
    /**
     * TodosLosDepartamentos ofrece la informacion de todos los departamentos
     */
    public void TodosLosDepartamentos() {
        StdOut.println("Datos del departamento");
        StdOut.println("===========================");
        StdOut.println("Id: " + departamento.getID());
        StdOut.println("Nombre: " + departamento.getNombre());
        StdOut.println("Nombre y apellido del jefe: " + jefeActual.getNombre() + " " + jefeActual.getApellido());
        StdOut.println("Rut del Clases.Jefe: " + jefeActual.getRut());
        StdOut.println("Bono: " + departamento.getBono());
    }

    @Override
    /**
     * Opcion que permite ingresar a un empleado dentro del sistema
     */
    public boolean IngresarEmpleado() throws ParseException {
        StdOut.println("Ingrese el nombre del empleado: ");
        String nombre = StdIn.readLine();

        StdOut.println("Ingrese el apellido del empleado: ");
        String apellido = StdIn.readLine();

        StdOut.println("Ingrese el rut del empleado: ");
        String rut = StdIn.readLine();
        if (listaTrabajadores.buscarTrabajador(rut))
        {
            StdOut.println("El rut ya se encuentra registrado");
            return false;
        }
        if (rut.contains(".") || rut.contains("-"))
        {
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
        }

        if (!rutValido(rut))
        {
            StdOut.println("El rut ingersado no es valido");
            return false;
        }

        StdOut.println("Ingrese la fecha de nacimiento: ");
        String nacimiento = StdIn.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(nacimiento);
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(date);
        StdOut.println("Ingrese el sueldo del empleado: ");
        int sueldo = Integer.parseInt(StdIn.readLine());

        StdOut.println("Ingrese la fecha de inicio del empleado: ");
        String fechaIni = StdIn.readString();
        Date date2 = sdf.parse(fechaIni);
        Calendar fechaInicio = Calendar.getInstance();
        fechaNacimiento.setTime(date2);

        StdOut.println("Ingrese el bono de productividad del empleado: ");
        int bono = StdIn.readInt();


        Empleado empleado = new Empleado(nombre, apellido, rut, nacimiento, sueldo, fechaIni, bono, null);
        listaTrabajadores.agregarTrabajadores(empleado);

        StdOut.println("Trabajador registrado con éxito");
        StdOut.println("Con los siguientes datos:");
        StdOut.println("Rut: " + rut);
        StdOut.println("Nombre: " + nombre + " Apellido: " + apellido);
        StdOut.println("Fecha de nacimiento: " + fechaNacimiento);
        StdOut.println("Sueldo " + sueldo);
        StdOut.println("Fecha de inicio: " + fechaInicio);
        StdOut.println("Bono: " + bono);

        StdOut.println("Presione enter para continuar");
        StdIn.readLine();

        return true;
    }

    @Override
    /**
     * Ingresardepartamento ofrece la opcion de ingresar un nuevo departamento al sistema
     */
    public boolean IngresarDepartamento() {

        StdOut.println("Ingrese el nombre del departamento: ");
        String nombre = StdIn.readLine();

        StdOut.println("Ingrese el bono asosciado al departamento: ");
        int bono = StdIn.readInt();

        StdOut.println("Ingrese la cantidad de empleados que posee el departamento: ");
        int cantEmpleados = StdIn.readInt();

        StdOut.println("Ingrese el rut del jefe asignado");
        String rutJefe = StdIn.readLine();
        if (listaTrabajadores.buscarTrabajador(trabajadores.getRut())) {
            StdOut.println("El rut ingresado ya se encuentra registrado");
            return false;
        }
        if (rutJefe.contains(".") || rutJefe.contains("-")) {
            rutJefe = rutJefe.replace(".", "");
            rutJefe = rutJefe.replace("-", "");
        }
        if (!rutValido(rutJefe)) {
            StdOut.println("El rut ingresado no es válido");
            return false;
        }

        String ID;
        ID = randomID();


        Departamento departamento = new Departamento(ID, nombre, bono, rutJefe, cantEmpleados);
        listaDepartamento.agregarDepartamento(departamento);

        StdOut.println("Departamento registrado con éxito");
        StdOut.println("Con los siguientes datos:");
        StdOut.println("ID " + ID);
        StdOut.println("Nombre: " + nombre);
        StdOut.println("Rut del Jefe " + rutJefe);
        StdOut.println("Cantidad de empleados " + cantEmpleados);

        StdOut.println("Presione enter para continuar");
        StdIn.readLine();


        return true;
    }

    @Override
    /**
     * departamentoSegunJefe es un metodo que permite saber que jefe fue asignado a un departamento en especifico
     */
    public void departamentoSegunJefe() {
        StdOut.println("Ingrese el rut del jefe a buscar");
        String rutJefe = StdIn.readString();

        if (rutJefe.equals(jefeActual.getRut())){
            departamento.setRutJefe(rutJefe);
            StdOut.println("El departamento que posee el jefe es: "+listaDepartamento.buscarDepartamentoSegunJefe(rutJefe));
        }
    }

    @Override
    /**
     * departamentoMasEmpleados ofrece informacion con respecto a que departamento posee la mayor cantidad de empleados
     */
    public void departamentoMasEmpleados() {

        int contador = 0;
        for (int i = 0; i < listaTrabajadores.getCantActual(); i++)
        {
            Trabajadores trabajador = listaTrabajadores.obtenerTrabajador(i);
            if (i>contador){
                contador=i;
            }


            StdOut.println("El departamento "+departamento.getNombre()+" posee una cantidad de "+contador);
        }
    }

    @Override
    /**
     * departamentoMenosEmpleados ofrece la informacion de que departamento posee la menor cantidad de empleados
     */
    public void departamentoMenosEmpleados() {
        int contador = 0;
        for (int i = 0; i < listaTrabajadores.getCantActual(); i++)
        {
            Trabajadores trabajador = listaTrabajadores.obtenerTrabajador(i);
            if (i<contador){
                contador=i;
            }


            StdOut.println("El departamento "+departamento.getNombre()+" posee una cantidad de "+contador);
        }
    }


    @Override
    /**
     * Metodo que ordena a los departamentos segun su rango de bonos
     */
    public void departamentoSegunRangoDeBonos() { //falta
        StdOut.println("Ingrese cota de bono inicial");
        int bono1=StdIn.readInt();
        StdOut.println("Ingrese cota de bono final");
        int bono2=StdIn.readInt();

        if (bono1 > bono2){
            for (int i = bono1; i <=bono2 ; i++) {
                listaDepartamento.buscarDepartamentoSegunRangoBono(i);
                StdOut.println("Los departamentos disponibles segun el rango son: ");
            }
        }else {
            StdOut.println("La primera cota debe ser inferior a la segunda");
        }

    }

    @Override
    /**
     * Verifica en el sistema cual es el Jefe que posee la mayor cantidad de departamentos
     */
    public void jefeMasDepartamentos() { // probar
        int mayor = 0;
        int contador = 0;
        for (int i = 0; i < listaDepartamento.getCantActual(); i++) {
                if (listaDepartamento.getCantActual()== listaDepartamento.getCantMax()) {
                    contador++;

            }
            if (contador > mayor) {
                mayor = contador;

            }
            contador = 0;
        }
        StdOut.println("El jefe con más departamentos es: " + jefeActual.getNombre()+ " con una cantidad de" + mayor+" departamentos");
        StdOut.println("Presione enter para continuar");
        StdIn.readLine();
    }


    @Override
    /**
     * Metodo que ordena a los empleados segun su departamento asignado
     */
    public void empleadosSegunDepartamento() { // falta
        TodosLosDepartamentos();
        StdOut.println("¿Que departamento desea seleccionar");
        String opcionDepa = StdIn.readString();
    }

    @Override
    /**
     * Metodo que ordena a los empleados segun rango de Inicio
     */
    public void empleadosSegunRangoDeInicio() { // falta
        StdOut.println("Ingrese cota inferior:");
        String cotaInferior = StdIn.readString();
        StdOut.println("Ingrese cota superior:");
        String cotaSuperior = StdIn.readString();

    }

    @Override
    /**
     * Metodo que ordena a los empleados segun su Jefe asignado
     */
    public void empleadosSegunJefatura() { // falta
        StdOut.println("Ingrese el rut del jefe designado");
        String rutJefe = StdIn.readString();

        if(rutJefe.equals(trabajadores.getRut())){
            listaTrabajadores.buscarTrabajador(rutJefe);
            StdOut.println("Los empleados asignados a un jefe son: ");
        }
    }

    @Override
    /**
     * Metodo que ordena a los empleados segun su rango de sueldo
     */
    public void empleadosSegunRangoDeSueldo() { //falta
        StdOut.println("Ingrese un rango de sueldos inicial");
        String rango1 = StdIn.readString();
        StdOut.println("Ingrese el rango de sueldos final");
        String rango2 = StdIn.readString();
    }

    @Override
    /**
     * Metodo que ordena a los empleados segun su rango de edad
     */
    public void empleadosSegunRangoEdad() { // falta
        StdOut.println("Ingrese cota de edad inicial");
        int edad1=StdIn.readInt();
        StdOut.println("Ingrese cota de bono final");
        int edad2=StdIn.readInt();

        if (edad1 > edad2){
            for (int i = edad1; i <=edad2 ; i++) {
                
                StdOut.println("Los departamentos disponibles segun el rango son: ");
            }
        }else {
            StdOut.println("La primera cota debe ser inferior a la segunda");
        }
    }

    @Override
    /**
     * Metodo que verifica en el sistema al empleado que posee el mayor sueldo
     */
    public void empleadoMayorSueldo() {
        int mayorSueldo = -999999999;
        int contador = 0;
        for (int i = 0; i < listaTrabajadores.getCantActual(); i++)
        {
            Trabajadores trabajador = listaTrabajadores.obtenerTrabajador(i);
            if(trabajador.getSueldo() > mayorSueldo)
            {
                mayorSueldo = trabajador.getSueldo();
            }

            StdOut.println("El mayor sueldo es de "+mayorSueldo);
        }
    }

    @Override
    /**
     * Metodo que verifica en el sistema cual es el empleado que posee el menor sueldo
     */
    public void empleadoMenorSueldo()
    {
        int menorSueldo = 999999999;
        int contador = 0;
        for (int i = 0; i < listaTrabajadores.getCantActual(); i++)
        {
            Trabajadores trabajador = listaTrabajadores.obtenerTrabajador(i);
            if(trabajador.getSueldo() < menorSueldo)
            {
                menorSueldo = trabajador.getSueldo();
            }

        StdOut.println("El menor sueldo es de "+menorSueldo);
        }


    }

    /**
     *  Metod que pasa un dato de String a un dato double
     * @param str String a verificar
     * @return retorna falso si el numero ingresado esta mal ingresado y true si esta correctamente ingresado
     */
    private boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * escribirArchivos permite la escritura de un archivo txt con la informacion pedida dentro del programa
     * @throws IOException
     */
    @Override
    public void escribirArchivos() throws IOException {

        ArchivoSalida arch = new ArchivoSalida("Taller2/datos.txt");
        int contador = 0;
        Registro reg;

        for (Departamento d : listaDepartamento.getVector()) {
            if (d == null) {
                break;
            }
            reg = new Registro(5);

            reg.agregarCampo(d.getID());
            reg.agregarCampo(d.getNombre());
            reg.agregarCampo(d.getBono());
            reg.agregarCampo(d.getRutJefe());
            reg.agregarCampo(d.getCant_Empleados());

        }

        for (Trabajadores t : listaTrabajadores.getTrabajadores()){
            if (t == null) {
                break;
            }
            reg = new Registro(7);

            reg.agregarCampo(t.getNombre());
            reg.agregarCampo(t.getApellido());
            reg.agregarCampo(t.getRut());
            reg.agregarCampo(String.valueOf(t.getfechaNacimiento()));
            reg.agregarCampo(t.getSueldo());
            reg.agregarCampo(String.valueOf(t.getfechaInicio()));
            reg.agregarCampo(t.getBono());

            arch.writeRegistro(reg);
            contador++;
        }
        arch.close();
    }

    /**
     * Permite validar un rut ingresado por consola
     * @param rut rut a verificar
     * @return true si el rut tiene el formato correcto, false si no lo es
     */
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

    /**
     * rutFormateado es un metodo que corrige la escritura de un rut a un parametro determinado
     * @param rut es el rut que es entregado por consola
     * @return
     */
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

    /**
     * randomID ofrece la creacion de un ID personalizado
     * @return sieve para retornar la ID creada
     */
    public String randomID()
        {
            String ID;
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String Numbers = "0123456789";
            StringBuilder sb = new StringBuilder();
            StringBuilder nb = new StringBuilder();


            for (int i = 0; i < 3; i++)
            {
                int index = (int)(alphabet.length()* Math.random());
                sb.append(alphabet.charAt(index));

            }
            sb.toString();

            for (int i = 0; i < 3; i++)
            {
                int index = (int)(Numbers.length()* Math.random());
                nb.append(Numbers.charAt(index));

            }
            nb.toString();

            ID = (sb + "-" + nb);
            return ID;

        }


    /**
     * cargarDatos es un metodo que lee el archivo de texto y los guarda dentro del sistema
     * @return sirve para verificar si se realizo la carga de los datos
     * @throws IOException
     * @throws ParseException
     */
    public boolean cargarDatos() throws IOException, ParseException {
        ArchivoEntrada archivo = new ArchivoEntrada("Taller2/datos.txt");
        while(!archivo.isEndFile())
        {
            Registro regEnt = archivo.getRegistro();
            String ID = regEnt.getString();
            String nombredepa = regEnt.getString();
            int bonoDepa = regEnt.getInt();
            String rutjefe = regEnt.getString();
            int cantEmpleados = regEnt.getInt();
            Clases.Departamento departamento = new Clases.Departamento(ID,nombredepa,bonoDepa,rutjefe,cantEmpleados);
            listaDepartamento.agregarDepartamento(departamento);

            for (int i = 1; i <= cantEmpleados; i++)
            {
                regEnt = archivo.getRegistro();
                String nombre = regEnt.getString();
                String apellido = regEnt.getString();
                String rut = regEnt.getString();

                String diaDeNacimiento = regEnt.getString();
                //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                //Date date = sdf.parse(fecha);
                //Calendar diaDeNacimiento = Calendar.getInstance();
                //diaDeNacimiento.setTime(date);

                int salario = regEnt.getInt();

                String fechaIngreso = regEnt.getString();
                //Date date2 = sdf.parse(fecha2);
                //Calendar fechaIngreso = Calendar.getInstance();
                //fechaIngreso.setTime(date2);

                int bonoProductividad = regEnt.getInt();

                Empleado empleado = new Clases.Empleado(nombre, apellido,rut, diaDeNacimiento, salario, fechaIngreso, bonoProductividad, rutjefe);
                listaTrabajadores.agregarTrabajadores(empleado);


            }
        }
        archivo.close();
        return true;
    }
    @Override
    /**
    * Salir es el metodo que cierra el programa
    */
    public void Salir() {
        System.exit(6);
    }
}
