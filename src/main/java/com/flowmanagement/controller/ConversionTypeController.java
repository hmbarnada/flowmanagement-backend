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

import com.flowmanagement.model.ConversionType;
import com.flowmanagement.service.IConversionTypeService;

@RestController
@RequestMapping("/conversion_types")
public class ConversionTypeController {

	@Autowired
	private IConversionTypeService service;
	
	@GetMapping("/")
	public List<ConversionType> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ConversionType getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public ConversionType add(@RequestBody ConversionType obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public ConversionType update(@RequestBody ConversionType obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
