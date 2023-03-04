/**
 * 
 */
package com.buenmaestro.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.buenmaestro.projectwebservices.entity.Empleado;

/**
 * @author heber
 *
 */
public class EmpleadoService {
	
	/**
	 * @author heber 
	 * Metodo que permite consultar un empleado por su id
	 * @param numeroEmpleado {@link String} numero del empleado
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();

		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}
		}

		return null;

	}

	/**
	 * @author heber 
	 * Metodo que simula la consulta de un empleado
	 * @return {@link Empleado} empleado consultado
	 */

	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Carlos");
		empleado.setPrimerApellido("Santiago");
		empleado.setSegundoApellido("Hernandez");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);

		return empleado;
	}

	/**
	 * @author heber 
	 * Metodo que permite consultar la lista de empleados
	 * @return
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList();

		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Carlos");
		empleado.setPrimerApellido("Santiago");
		empleado.setSegundoApellido("Hernandez");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);

		Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setNumeroEmpleado("786467");
		empleadoNuevo.setNombre("Erick");
		empleadoNuevo.setPrimerApellido("Guerrero");
		empleadoNuevo.setSegundoApellido("Nava");
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		empleadoNuevo.setEdad(28);

		empleados.add(empleado);
		empleados.add(empleadoNuevo);

		return empleados;
	}

}
