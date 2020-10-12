package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConditionParameter;

public interface IConditionParameterService {

	ConditionParameter add(ConditionParameter conditionParameter);
	ConditionParameter update(ConditionParameter conditionParameter);
	List<ConditionParameter> getAll();
	ConditionParameter getById(Integer id);
	void delete(Integer id);
}
