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

import com.flowmanagement.model.ConditionType;
import com.flowmanagement.service.IConditionTypeService;

@RestController
@RequestMapping("/condition_type")
public class ConditionTypeController {

	@Autowired
	private IConditionTypeService service;
	
	@GetMapping
	public List<ConditionType> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ConditionType listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public ConditionType registrar(@RequestBody ConditionType obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public ConditionType modificar(@RequestBody ConditionType obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
