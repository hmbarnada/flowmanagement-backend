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

import com.flowmanagement.model.Condition;
import com.flowmanagement.service.IConditionService;

@RestController
@RequestMapping("/conditions")
public class ConditionController {

	@Autowired
	private IConditionService service;
	
	@GetMapping
	public List<Condition> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Condition listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Condition registrar(@RequestBody Condition obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Condition modificar(@RequestBody Condition obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
