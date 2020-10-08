package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Operation;

public interface IOperationService {
	Operation registrar(Operation operation);
	Operation modificar(Operation operation);
	List<Operation> listar();
	Operation listarPorId(Integer id);
	void eliminar(Integer id);
}
