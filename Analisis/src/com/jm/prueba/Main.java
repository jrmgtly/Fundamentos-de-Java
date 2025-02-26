package com.jm.prueba;

import com.jm.entidad.Cliente;
import com.jm.entidad.Cliente;

import Mantenimiento.Servicio;

public class Main {

	public static void main(String[] args) {
		Integer idCliente = 12345;
		String nombre = "Jose";
		String apellido = "Martinez";
		String nacionalidad = "guatemalteco";
		String etnia = "Mestizo";
		
		Servicio servicio = new Servicio();
		servicio.registrarCliente(idCliente, nombre, apellido, nacionalidad, etnia);
		
		for (Cliente p : servicio.listaClientes()) {
			System.out.println(p.getIdCliente());
			System.out.println(p.getNombre());
			System.out.println(p.getApellido());
			System.out.println(p.getEtnia());
		}

	}

}
