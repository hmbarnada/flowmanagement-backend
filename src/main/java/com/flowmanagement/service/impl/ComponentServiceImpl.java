package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Component;
import com.flowmanagement.repo.IComponentRepo;
import com.flowmanagement.service.IComponentService;

@Service
public class ComponentServiceImpl implements IComponentService {

	@Autowired
	private IComponentRepo repo;
	
	@Override
	public Component registrar(Component component) {
		return repo.save(component);
	}

	@Override
	public Component modificar(Component component) {
		return repo.save(component);
	}

	@Override
	public List<Component> listar() {
		return repo.findAll();
	}

	@Override
	public Component listarPorId(Integer id) {
		Optional<Component> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Component();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
