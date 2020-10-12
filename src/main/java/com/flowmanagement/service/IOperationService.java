package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Operation;

public interface IOperationService {
	Operation add(Operation operation);
	Operation update(Operation operation);
	List<Operation> getAll();
	Operation getById(Integer id);
	void delete(Integer id);
}
