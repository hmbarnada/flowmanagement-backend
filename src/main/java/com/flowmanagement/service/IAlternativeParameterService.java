package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.AlternativeParameter;

public interface IAlternativeParameterService {

	AlternativeParameter add(AlternativeParameter alternativeParameter);
	AlternativeParameter update(AlternativeParameter alternativeParameter);
	List<AlternativeParameter> getAll();
	AlternativeParameter getById(Integer id);
	void delete(Integer id);
}
