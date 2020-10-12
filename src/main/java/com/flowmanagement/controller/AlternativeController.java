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

import com.flowmanagement.model.Alternative;
import com.flowmanagement.service.IAlternativeService;

@RestController
@RequestMapping("/alternatives")
public class AlternativeController {

	@Autowired
	private IAlternativeService service;
	
	@GetMapping("/")
	public List<Alternative> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Alternative getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Alternative add(@RequestBody Alternative obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public Alternative update(@RequestBody Alternative obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
