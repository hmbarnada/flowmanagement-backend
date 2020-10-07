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
	
	@GetMapping
	public List<Guide> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Guide listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Guide registrar(@RequestBody Guide obj) {
		return service.registrar(obj);
	}
	
	@PutMapping
	public Guide modificar(@RequestBody Guide obj) {
		return service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
