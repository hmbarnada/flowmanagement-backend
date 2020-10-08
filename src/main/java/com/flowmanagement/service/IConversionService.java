package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Conversion;

public interface IConversionService {

	Conversion registrar(Conversion conversion);
	Conversion modificar(Conversion conversion);
	List<Conversion> listar();
	Conversion listarPorId(Integer id);
	void eliminar(Integer id);
}
