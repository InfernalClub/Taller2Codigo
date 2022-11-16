package Clases;

import Clases.Departamento;

import java.util.Calendar;

public class Empleado extends Trabajadores {
      Jefe jefeDepartamento;

        public Empleado(String nombre, String apellido, String rut, Calendar fechaNacimiento, int sueldo, Calendar fechaInicio, int bono) {
                super(nombre, apellido, rut, fechaNacimiento, sueldo, fechaInicio, bono);
        }

        public Jefe getJefeDepartamento() {
                return jefeDepartamento;
        }

        public void setJefeDepartamento(Jefe jefeDepartamento) {
                this.jefeDepartamento = jefeDepartamento;
        }
}
