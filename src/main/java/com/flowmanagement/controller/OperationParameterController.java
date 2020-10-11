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

import com.flowmanagement.model.OperationParameter;
import com.flowmanagement.service.IOperationParameterService;

@RestController
@RequestMapping("/operation_parameters")
public class OperationParameterController {

	@Autowired
	private IOperationParameterService service;
	
	@GetMapping
	public List<OperationParameter> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public OperationParameter listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public OperationParameter registrar(@RequestBody OperationParameter obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public OperationParameter modificar(@RequestBody OperationParameter obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
