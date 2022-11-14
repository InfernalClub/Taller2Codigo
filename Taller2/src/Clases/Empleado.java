package Clases;

import Clases.Departamento;

import java.util.Calendar;

public class Empleado extends Trabajadores {
      Jefe jefeDepartamento;

        public Empleado(String nombre, String apellido, String rut, int edad, int sueldo, Calendar fechaIngreso, Departamento departamento) {
                super(nombre, apellido, rut, edad, sueldo, fechaIngreso, departamento);
        }

        public Jefe getJefeDepartamento() {
                return jefeDepartamento;
        }

        public void setJefeDepartamento(Jefe jefeDepartamento) {
                this.jefeDepartamento = jefeDepartamento;
        }
}
