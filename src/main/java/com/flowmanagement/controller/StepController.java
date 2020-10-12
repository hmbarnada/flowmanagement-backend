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

import com.flowmanagement.model.Step;
import com.flowmanagement.service.IStepService;

@RestController
@RequestMapping("/steps")
public class StepController {
	
	@Autowired
	private IStepService service;
	
	@GetMapping("/")
	public List<Step> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Step getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Step add(@RequestBody Step obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public Step update(@RequestBody Step obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}

}
