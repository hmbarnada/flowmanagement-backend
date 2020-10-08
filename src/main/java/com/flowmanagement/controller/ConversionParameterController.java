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

import com.flowmanagement.model.ConversionParameter;
import com.flowmanagement.service.IConversionParameterService;

@RestController
@RequestMapping("/conversion_parameter")
public class ConversionParameterController {

	@Autowired
	private IConversionParameterService service;
	
	@GetMapping
	public List<ConversionParameter> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ConversionParameter listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public ConversionParameter registrar(@RequestBody ConversionParameter obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public ConversionParameter modificar(@RequestBody ConversionParameter obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
