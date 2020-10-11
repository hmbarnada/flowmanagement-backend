package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.OperationType;

public interface IOperationTypeService {

	OperationType registrar(OperationType operationType);
	OperationType modificar(OperationType operationType);
	List<OperationType> listar();
	OperationType listarPorId(Integer id);
	void eliminar(Integer id);
}
