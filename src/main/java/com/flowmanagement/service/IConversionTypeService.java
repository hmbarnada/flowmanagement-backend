package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConversionType;

public interface IConversionTypeService {

	ConversionType registrar(ConversionType conversionType);
	ConversionType modificar(ConversionType conversionType);
	List<ConversionType> listar();
	ConversionType listarPorId(Integer id);
	void eliminar(Integer id);
}
