package com.flowmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flowmanagement.model.Conversion;
import com.flowmanagement.service.IConversionService;

@RestController
@RequestMapping("/conversions")
public class ConversionController {
	
	@Autowired
	private IConversionService service;
	
	@GetMapping
	public List<Conversion> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Conversion listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Conversion registrar(@RequestBody Conversion obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Conversion modificar(@RequestBody Conversion obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
