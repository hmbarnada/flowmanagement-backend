package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConditionType;

public interface IConditionTypeService {

	ConditionType registrar(ConditionType conditionType);
	ConditionType modificar(ConditionType conditionType);
	List<ConditionType> listar();
	ConditionType listarPorId(Integer id);
	void eliminar(Integer id);
}
