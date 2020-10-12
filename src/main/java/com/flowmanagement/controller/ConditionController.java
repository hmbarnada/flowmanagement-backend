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

import com.flowmanagement.model.Condition;
import com.flowmanagement.service.IConditionService;

@RestController
@RequestMapping("/conditions")
public class ConditionController {

	@Autowired
	private IConditionService service;
	
	@GetMapping("/")
	public List<Condition> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Condition getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Condition add(@RequestBody Condition obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public Condition update(@RequestBody Condition obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
