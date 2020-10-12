package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConversionType;

public interface IConversionTypeService {

	ConversionType add(ConversionType conversionType);
	ConversionType update(ConversionType conversionType);
	List<ConversionType> getAll();
	ConversionType getById(Integer id);
	void delete(Integer id);
}
