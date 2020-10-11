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

import com.flowmanagement.model.Operation;
import com.flowmanagement.service.IOperationService;

@RestController
@RequestMapping("/operations")
public class OperationController {

	@Autowired
	private IOperationService service;
	
	@GetMapping
	public List<Operation> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Operation listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Operation registrar(@RequestBody Operation obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Operation modificar(@RequestBody Operation obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
