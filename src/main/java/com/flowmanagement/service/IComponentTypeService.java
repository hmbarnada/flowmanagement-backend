package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ComponentType;

public interface IComponentTypeService {
	ComponentType add(ComponentType componentType);
	ComponentType update(ComponentType componentType);
	List<ComponentType> getAll();
	ComponentType getById(Integer id);
	void delete(Integer id);
}
