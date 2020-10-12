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
	
	@GetMapping("/")
	public List<OperationParameter> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public OperationParameter getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public OperationParameter add(@RequestBody OperationParameter obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public OperationParameter update(@RequestBody OperationParameter obj) {return service.update(obj); }
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) { service.delete(id);}
}
