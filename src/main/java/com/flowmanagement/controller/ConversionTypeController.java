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

import com.flowmanagement.model.ConversionType;
import com.flowmanagement.service.IConversionTypeService;

@RestController
@RequestMapping("/conversion_type")
public class ConversionTypeController {

	@Autowired
	private IConversionTypeService service;
	
	@GetMapping
	public List<ConversionType> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ConversionType listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public ConversionType registrar(@RequestBody ConversionType obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public ConversionType modificar(@RequestBody ConversionType obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
