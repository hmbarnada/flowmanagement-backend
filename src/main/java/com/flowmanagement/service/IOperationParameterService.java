package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.OperationParameter;

public interface IOperationParameterService {

	OperationParameter registrar(OperationParameter operationParameter);
	OperationParameter modificar(OperationParameter operationParameter);
	List<OperationParameter> listar();
	OperationParameter listarPorId(Integer id);
	void eliminar(Integer id);
}
