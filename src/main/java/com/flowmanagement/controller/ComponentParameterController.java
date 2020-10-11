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

import com.flowmanagement.model.ComponentParameter;
import com.flowmanagement.service.IComponentParameterService;

@RestController
@RequestMapping("/component_parameters")
public class ComponentParameterController {

	@Autowired
	private IComponentParameterService service;
	
	@GetMapping
	public List<ComponentParameter> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ComponentParameter listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public ComponentParameter registrar(@RequestBody ComponentParameter obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public ComponentParameter modificar(@RequestBody ComponentParameter obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
