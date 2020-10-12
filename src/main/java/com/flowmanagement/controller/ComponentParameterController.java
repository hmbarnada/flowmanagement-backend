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

import com.flowmanagement.model.ComponentParameter;
import com.flowmanagement.service.IComponentParameterService;

@RestController
@RequestMapping("/component_parameters")
public class ComponentParameterController {

	@Autowired
	private IComponentParameterService service;
	
	@GetMapping("/")
	public List<ComponentParameter> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ComponentParameter getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public ComponentParameter add(@RequestBody ComponentParameter obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public ComponentParameter update(@RequestBody ComponentParameter obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
