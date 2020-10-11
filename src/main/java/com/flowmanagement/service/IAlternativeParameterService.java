package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.AlternativeParameter;

public interface IAlternativeParameterService {

	AlternativeParameter registrar(AlternativeParameter alternativeParameter);
	AlternativeParameter modificar(AlternativeParameter alternativeParameter);
	List<AlternativeParameter> listar();
	AlternativeParameter listarPorId(Integer id);
	void eliminar(Integer id);
}
