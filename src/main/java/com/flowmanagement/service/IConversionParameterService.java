package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ConversionParameter;

public interface IConversionParameterService {

	ConversionParameter registrar(ConversionParameter conversionParameter);
	ConversionParameter modificar(ConversionParameter conversionParameter);
	List<ConversionParameter> listar();
	ConversionParameter listarPorId(Integer id);
	void eliminar(Integer id);
}
