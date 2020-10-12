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
	
	@GetMapping("/")
	public List<Operation> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Operation getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Operation add(@RequestBody Operation obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public Operation update(@RequestBody Operation obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
