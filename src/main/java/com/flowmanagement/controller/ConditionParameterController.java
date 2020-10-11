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

import com.flowmanagement.model.ConditionParameter;
import com.flowmanagement.service.IConditionParameterService;

@RestController
@RequestMapping("/condition_parameters")
public class ConditionParameterController {

	@Autowired
	private IConditionParameterService service;
	
	@GetMapping
	public List<ConditionParameter> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public ConditionParameter listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public ConditionParameter registrar(@RequestBody ConditionParameter obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public ConditionParameter modificar(@RequestBody ConditionParameter obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
