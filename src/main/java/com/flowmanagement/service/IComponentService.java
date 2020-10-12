package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Component;

public interface IComponentService {

	Component add(Component component);
	Component update(Component component);
	List<Component> getAll();
	Component getById(Integer id);
	void delete(Integer id);
}
