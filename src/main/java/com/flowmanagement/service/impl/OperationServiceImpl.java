package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Operation;
import com.flowmanagement.repo.IOperationRepo;
import com.flowmanagement.service.IOperationService;

@Service
public class OperationServiceImpl implements IOperationService {

	@Autowired
	private IOperationRepo repo;
	
	@Override
	public Operation add(Operation operation) {
		return repo.save(operation);
	}

	@Override
	public Operation update(Operation operation) {
		return repo.save(operation);
	}

	@Override
	public List<Operation> getAll() {
		return repo.findAll();
	}

	@Override
	public Operation getById(Integer id) {
		Optional<Operation> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Operation();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
