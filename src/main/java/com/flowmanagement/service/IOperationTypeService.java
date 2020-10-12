package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.OperationType;

public interface IOperationTypeService {

	OperationType add(OperationType operationType);
	OperationType update(OperationType operationType);
	List<OperationType> getAll();
	OperationType getById(Integer id);
	void delete(Integer id);
}
