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

import com.flowmanagement.model.Component;
import com.flowmanagement.service.IComponentService;

@RestController
@RequestMapping("/component")
public class ComponentController {

	@Autowired
	private IComponentService service;
	
	@GetMapping
	public List<Component> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Component listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Component registrar(@RequestBody Component obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Component modificar(@RequestBody Component obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
