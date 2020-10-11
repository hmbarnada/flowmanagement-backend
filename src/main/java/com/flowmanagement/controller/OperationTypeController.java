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

import com.flowmanagement.model.OperationType;
import com.flowmanagement.service.IOperationTypeService;

@RestController
@RequestMapping("/operation_types")
public class OperationTypeController {

	@Autowired
	private IOperationTypeService service;
	
	@GetMapping
	public List<OperationType> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public OperationType listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public OperationType registrar(@RequestBody OperationType obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public OperationType modificar(@RequestBody OperationType obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
