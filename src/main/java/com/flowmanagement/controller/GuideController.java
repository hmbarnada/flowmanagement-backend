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

import com.flowmanagement.model.Guide;
import com.flowmanagement.service.IGuideService;

@RestController
@RequestMapping("/guides")
public class GuideController {

	@Autowired
	private IGuideService service;
	
	@GetMapping("/")
	public List<Guide> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Guide getById(@PathVariable("id") Integer id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Guide add(@RequestBody Guide obj) {
		return service.add(obj);
	}
	
	@PutMapping("/update")
	public Guide update(@RequestBody Guide obj) {
		return service.update(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
