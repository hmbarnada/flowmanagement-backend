package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConditionType;

public interface IConditionTypeService {

	ConditionType add(ConditionType conditionType);
	ConditionType update(ConditionType conditionType);
	List<ConditionType> getAll();
	ConditionType getById(Integer id);
	void delete(Integer id);
}
