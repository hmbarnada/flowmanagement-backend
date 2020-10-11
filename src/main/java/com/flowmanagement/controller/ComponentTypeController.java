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

import com.flowmanagement.model.ComponentType;
import com.flowmanagement.service.IComponentTypeService;

@RestController
@RequestMapping("/component_types")
public class ComponentTypeController {

	@Autowired
	private IComponentTypeService service;
	
	@GetMapping
	public List<ComponentType> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ComponentType listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public ComponentType registrar(@RequestBody ComponentType obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public ComponentType modificar(@RequestBody ComponentType obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
