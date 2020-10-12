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

import com.flowmanagement.model.ComponentType;
import com.flowmanagement.service.IComponentTypeService;

@RestController
@RequestMapping("/component_types")
public class ComponentTypeController {

	@Autowired
	private IComponentTypeService service;
	
	@GetMapping("/")
	public List<ComponentType> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ComponentType getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public ComponentType add(@RequestBody ComponentType obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public ComponentType update(@RequestBody ComponentType obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
