package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.repository.InterfaceCliente;
import com.api.modelo.Cliente;

/**
 * RequestMapping("end points" eje /Employee, /Taks etc)
 * @author niels
 *
 */

@RestController
@RequestMapping("/Cliente")

public class ClienteController {
	
	
	
	@Autowired
	private InterfaceCliente interfaceCliente;
	
	
	@GetMapping
	public List<Cliente> clientes(){
		
		return (List<Cliente>) interfaceCliente.findAll();
		
	}
	
	@GetMapping(value="/{id}")
	public Optional<Cliente> cliente(@PathVariable("id") Integer id){
		
		return interfaceCliente.findById(id);
		
	}
	
	@PostMapping
	public String insertar(@RequestBody Cliente cl)
	{
		interfaceCliente.save(cl);
		
		return "Cliente Guardado";
	}
	
	@PutMapping
	public void modificar(@RequestBody Cliente cl) {
		interfaceCliente.save(cl);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		interfaceCliente.deleteById(id);
	}
	
	
	
	

	
}
