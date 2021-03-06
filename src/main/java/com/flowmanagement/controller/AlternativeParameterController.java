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

import com.flowmanagement.model.AlternativeParameter;
import com.flowmanagement.service.IAlternativeParameterService;

@RestController
@RequestMapping("/alternative_parameters")
public class AlternativeParameterController {

	@Autowired
	private IAlternativeParameterService service;
	
	@GetMapping("/")
	public List<AlternativeParameter> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public AlternativeParameter getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public AlternativeParameter add(@RequestBody AlternativeParameter obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public AlternativeParameter update(@RequestBody AlternativeParameter obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
