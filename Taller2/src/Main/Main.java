package Main;

import ucn.ArchivoEntrada;
import ucn.Registro;
import ucn.StdIn;
import ucn.StdOut;




public class Main
{
    public static void main(String[] args) throws Exception {
        SistemaImpl sist = new SistemaImpl(1000);

             sist.Iniciar();
    }
}
