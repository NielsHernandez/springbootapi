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


import com.api.modelo.Producto;
import com.api.repository.InterfaceProducto;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
	
	
	@Autowired
	private InterfaceProducto interfaceProducto;
	
	
	@GetMapping
	public List<Producto> productos(){
		
		return (List<Producto>) interfaceProducto.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<Producto> producto(@PathVariable("id") Integer id){
		
		return interfaceProducto.findById(id);
		
	}
	
	@PostMapping
	public String insertar(@RequestBody Producto cl)
	{
		interfaceProducto.save(cl);
		
		return "Cliente Guardado";
	}
	
	@PutMapping
	public void modificar(@RequestBody Producto cl) {
		interfaceProducto.save(cl);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		interfaceProducto.deleteById(id);
	}
	
	
	
}
