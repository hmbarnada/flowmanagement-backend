package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Alternative;

public interface IAlternativeService {

	Alternative add(Alternative alternative);
	Alternative update(Alternative alternative);
	List<Alternative> getAll();
	Alternative getById(Integer id);
	void delete(Integer id);
}
