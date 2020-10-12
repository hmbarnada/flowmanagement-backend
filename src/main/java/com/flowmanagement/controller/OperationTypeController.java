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
	
	@GetMapping("/")
	public List<OperationType> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public OperationType getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public OperationType add(@RequestBody OperationType obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public OperationType update(@RequestBody OperationType obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
