package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConditionParameter;

public interface IConditionParameterService {

	ConditionParameter registrar(ConditionParameter conditionParameter);
	ConditionParameter modificar(ConditionParameter conditionParameter);
	List<ConditionParameter> listar();
	ConditionParameter listarPorId(Integer id);
	void eliminar(Integer id);
}
