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

import com.flowmanagement.model.Component;
import com.flowmanagement.service.IComponentService;

@RestController
@RequestMapping("/components")
public class ComponentController {

	@Autowired
	private IComponentService service;
	
	@GetMapping("/")
	public List<Component> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Component getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Component add(@RequestBody Component obj) {
		return service.add(obj);
	}
	
	@PutMapping("update")
	public Component update(@RequestBody Component obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
