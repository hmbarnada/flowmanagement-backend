package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.OperationParameter;

public interface IOperationParameterService {

	OperationParameter add(OperationParameter operationParameter);
	OperationParameter update(OperationParameter operationParameter);
	List<OperationParameter> getAll();
	OperationParameter getById(Integer id);
	void delete(Integer id);
}
