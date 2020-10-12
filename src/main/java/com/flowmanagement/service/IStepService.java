package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Step;

public interface IStepService {
	Step add(Step step);
	Step update(Step step);
	List<Step> getAll();
	Step getById(Integer id);
	void delete(Integer id);
}
