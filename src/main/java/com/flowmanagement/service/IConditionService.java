package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Condition;

public interface IConditionService {

	Condition add(Condition condition);
	Condition update(Condition condition);
	List<Condition> getAll();
	Condition getById(Integer id);
	void delete(Integer id);
}
