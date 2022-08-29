package com.otraForma.sprint;


import java.sql.SQLOutput;

public class SprintApplication {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("postobon", "cll 10 No 20-30", "401234567", 714320231);
		Empleado empleado = new Empleado("juan", "juan@gmail.com", "postobon", "operario");
		MovimientoDinero transaccion = new MovimientoDinero(300.324f, "pagoHorasExtras");

		System.out.println("DATOS DE LA EMPRESA");
		System.out.println();
		System.out.println("nombre de la empresa: " + empresa.getNombre());
		System.out.println("direccion de la empresa: " + empresa.getDireccion());
		System.out.println("telefono de la empresa: " + empresa.getTelefono());
		System.out.println("NIT de la empresa: " + empresa.getNIT());
		System.out.println();
		System.out.println();
		System.out.println("DATOS DEL EMPLEADO");
		System.out.println();
		System.out.println("nombre del empleado: " + empleado.getNombre());
		System.out.println("correo electronico: " + empleado.getCorreoElectronico());
		System.out.println("empresa en la que labora: " + empleado.getEmpresa());
		System.out.println("rol en la empresa: " + empleado.getRol());
		System.out.println();
		System.out.println();
		System.out.println("PAGO DE HORAS EXTRAS");
		System.out.println();
		System.out.println("motivo del pago: " + transaccion.getConceptoDelMovimiento());
		System.out.println("horas a pagar: " + transaccion.getMontoDelMovimiento());

	}


}
