package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Condition;

public interface IConditionService {

	Condition registrar(Condition condition);
	Condition modificar(Condition condition);
	List<Condition> listar();
	Condition listarPorId(Integer id);
	void eliminar(Integer id);
}
