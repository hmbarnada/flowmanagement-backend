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

import com.flowmanagement.model.Conversion;
import com.flowmanagement.service.IConversionService;

@RestController
@RequestMapping("/conversions")
public class ConversionController {
	
	@Autowired
	private IConversionService service;
	
	@GetMapping("/")
	public List<Conversion> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Conversion getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Conversion add(@RequestBody Conversion obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public Conversion update(@RequestBody Conversion obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
