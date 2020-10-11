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
	
	@GetMapping
	public List<AlternativeParameter> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public AlternativeParameter listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public AlternativeParameter registrar(@RequestBody AlternativeParameter obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public AlternativeParameter modificar(@RequestBody AlternativeParameter obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
