package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.OperationParameter;
import com.flowmanagement.repo.IOperationParameterRepo;
import com.flowmanagement.service.IOperationParameterService;

@Service
public class OperationParameterServiceImpl implements IOperationParameterService{

	@Autowired
	private IOperationParameterRepo repo;
	
	@Override
	public OperationParameter add(OperationParameter operationParameter) {
		return repo.save(operationParameter);
	}

	@Override
	public OperationParameter update(OperationParameter operationParameter) {
		return repo.save(operationParameter);
	}

	@Override
	public List<OperationParameter> getAll() {
		return repo.findAll();
	}

	@Override
	public OperationParameter getById(Integer id) {
		Optional<OperationParameter> op = repo.findById(id);
		return op.isPresent() ? op.get() : new OperationParameter();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
