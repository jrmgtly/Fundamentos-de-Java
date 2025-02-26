package Mantenimiento;


import java.util.ArrayList;
import java.util.List;

import com.jm.entidad.Cliente;

public class Servicio {
	
	//Variable global que representa el listado
	private List<Cliente> listaClientes = new ArrayList<>();

	public Cliente registrarCliente(Integer idCliente, String nombre, String apellido, String nacionalidad,String etnia) {
		Cliente cliente = new Cliente(idCliente, nombre, apellido, nacionalidad, etnia);
		
		//Agregar nueva persona al listado
		listaClientes.add(cliente);
		return cliente;
	}
	
		public List<Cliente> listaClientes(){
			return listaClientes;
	}
}
