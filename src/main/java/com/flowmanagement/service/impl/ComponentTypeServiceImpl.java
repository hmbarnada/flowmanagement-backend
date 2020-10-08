package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.ComponentType;
import com.flowmanagement.repo.IComponentTypeRepo;
import com.flowmanagement.service.IComponentTypeService;

@Service
public class ComponentTypeServiceImpl implements IComponentTypeService{

	@Autowired
	private IComponentTypeRepo repo;
	
	@Override
	public ComponentType registrar(ComponentType componentType) {
		return repo.save(componentType);
	}

	@Override
	public ComponentType modificar(ComponentType componentType) {
		return repo.save(componentType);
	}

	@Override
	public List<ComponentType> listar() {
		return repo.findAll();
	}

	@Override
	public ComponentType listarPorId(Integer id) {
		Optional<ComponentType> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ComponentType();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
