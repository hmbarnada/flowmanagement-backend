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
	public Operation registrar(Operation operation) {
		return repo.save(operation);
	}

	@Override
	public Operation modificar(Operation operation) {
		return repo.save(operation);
	}

	@Override
	public List<Operation> listar() {
		return repo.findAll();
	}

	@Override
	public Operation listarPorId(Integer id) {
		Optional<Operation> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Operation();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
