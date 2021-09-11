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

import com.api.repository.InterfaceDetalle;
import com.api.modelo.Detalle;

/**
 * RequestMapping("end points" eje /Employee, /Taks etc)
 * @author niels
 *
 */

@RestController
@RequestMapping("/Detalle")

public class DetalleController {
	
	
	
	@Autowired
	private InterfaceDetalle interfaceDetalle;
	
	
	@GetMapping
	public List<Detalle> detalles(){
		
		return (List<Detalle>) interfaceDetalle.findAll();
		
	}
	
	@GetMapping(value="/{id}")
	public Optional<Detalle> detalle(@PathVariable("id") Integer id){
		
		return interfaceDetalle.findById(id);
		
	}
	
	@PostMapping
	public String insertar(@RequestBody Detalle cl)
	{
		interfaceDetalle.save(cl);
		
		return "Cliente Guardado";
	}
	
	@PutMapping
	public void modificar(@RequestBody Detalle cl) {
		interfaceDetalle.save(cl);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		interfaceDetalle.deleteById(id);
	}
	
	
	
	

	
}