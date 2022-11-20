package Clases;

import Clases.Departamento;

import java.util.Calendar;

public class Empleado extends Trabajadores {
      Jefe jefeDepartamento;
      String rutJefe;

        public Empleado(String nombre, String apellido, String rut, String fechaNacimiento, int sueldo, String fechaInicio, int bono, String rutJefe) {
                super(nombre, apellido, rut, fechaNacimiento, sueldo, fechaInicio, bono);

        }

        public Jefe getJefeDepartamento() {
                return jefeDepartamento;
        }

        public void setJefeDepartamento(Jefe jefeDepartamento) {
                this.jefeDepartamento = jefeDepartamento;
        }
}
