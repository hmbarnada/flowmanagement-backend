package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConversionParameter;

public interface IConversionParameterService {

	ConversionParameter add(ConversionParameter conversionParameter);
	ConversionParameter update(ConversionParameter conversionParameter);
	List<ConversionParameter> getAll();
	ConversionParameter getById(Integer id);
	void delete(Integer id);
}
