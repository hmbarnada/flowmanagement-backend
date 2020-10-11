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
	
	@GetMapping
	public List<Step> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Step listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Step registrar(@RequestBody Step obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Step modificar(@RequestBody Step obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}

}
