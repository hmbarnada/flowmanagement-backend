package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Conversion;

public interface IConversionService {

	Conversion add(Conversion conversion);
	Conversion update(Conversion conversion);
	List<Conversion> getAll();
	Conversion getById(Integer id);
	void delete(Integer id);
}
