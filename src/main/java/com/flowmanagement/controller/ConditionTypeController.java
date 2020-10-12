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

import com.flowmanagement.model.ConditionType;
import com.flowmanagement.service.IConditionTypeService;

@RestController
@RequestMapping("/condition_types")
public class ConditionTypeController {

	@Autowired
	private IConditionTypeService service;
	
	@GetMapping("/")
	public List<ConditionType> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ConditionType getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public ConditionType add(@RequestBody ConditionType obj) {
		return service.add(obj);
	}
	
	@PutMapping("update")
	public ConditionType update(@RequestBody ConditionType obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
