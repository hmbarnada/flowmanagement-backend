package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ComponentParameter;

public interface IComponentParameterService {

	ComponentParameter add(ComponentParameter componentParameter);
	ComponentParameter update(ComponentParameter componentParameter);
	List<ComponentParameter> getAll();
	ComponentParameter getById(Integer id);
	void delete(Integer id);
}
