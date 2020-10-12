package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.ComponentParameter;
import com.flowmanagement.repo.IComponentParameterRepo;
import com.flowmanagement.service.IComponentParameterService;

@Service
public class ComponentParameterServiceImpl implements IComponentParameterService{
	
	@Autowired
	private IComponentParameterRepo repo;
	
	@Override
	public ComponentParameter add(ComponentParameter componentParameter) {
		return repo.save(componentParameter);
	}

	@Override
	public ComponentParameter update(ComponentParameter componentParameter) {
		return repo.save(componentParameter);
	}

	@Override
	public List<ComponentParameter> getAll() {
		return repo.findAll();
	}

	@Override
	public ComponentParameter getById(Integer id) {
		Optional<ComponentParameter> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ComponentParameter();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
