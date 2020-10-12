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

import com.flowmanagement.model.ConditionParameter;
import com.flowmanagement.service.IConditionParameterService;

@RestController
@RequestMapping("/condition_parameters")
public class ConditionParameterController {

	@Autowired
	private IConditionParameterService service;
	
	@GetMapping("/")
	public List<ConditionParameter> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ConditionParameter getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("add")
	public ConditionParameter add(@RequestBody ConditionParameter obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public ConditionParameter update(@RequestBody ConditionParameter obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
