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
import com.api.repository.InterfaceFactura;
import com.api.modelo.Factura;

/**
 * RequestMapping("end points" eje /Employee, /Taks etc)
 * @author niels
 *
 */

@RestController
@RequestMapping("/Factura")

public class FacturaController {
	
	
	
	@Autowired
	private InterfaceFactura interfaceFactura;
	
	
	@GetMapping
	public List<Factura> facturas(){
		
		return (List<Factura>) interfaceFactura.findAll();
		
	}
	
	@GetMapping(value="/{id}")
	public Optional<Factura> cliente(@PathVariable("id") Integer id){
		
		return interfaceFactura.findById(id);
		
	}
	
	@PostMapping
	public String insertar(@RequestBody Factura cl)
	{
		interfaceFactura.save(cl);
		
		return "Factura Guardado";
	}
	
	@PutMapping
	public void modificar(@RequestBody Factura cl) {
		interfaceFactura.save(cl);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		interfaceFactura.deleteById(id);
	}
	
	
	
	

	
}