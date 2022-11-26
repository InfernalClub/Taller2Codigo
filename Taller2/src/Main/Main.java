package Main;

import ucn.ArchivoEntrada;
import ucn.Registro;
import ucn.StdIn;
import ucn.StdOut;


/**
 *
 * Clase que representa el sistema
 */
public class Main
{
    /**
     * Metodo que ejecuta el programa
     * @param args argumentos de la linea de comandos
     * @throws Exception Si no se puede leer el archivo
     */
    public static void main(String[] args) throws Exception {
        SistemaImpl sist = new SistemaImpl(1000);

             sist.Iniciar();



    }
}
