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

import com.flowmanagement.model.Alternative;
import com.flowmanagement.service.IAlternativeService;

@RestController
@RequestMapping("/alternative")
public class AlternativeController {

	@Autowired
	private IAlternativeService service;
	
	@GetMapping
	public List<Alternative> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Alternative listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Alternative registrar(@RequestBody Alternative obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Alternative modificar(@RequestBody Alternative obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
