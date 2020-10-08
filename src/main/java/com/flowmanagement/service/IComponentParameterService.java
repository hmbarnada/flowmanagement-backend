package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ComponentParameter;

public interface IComponentParameterService {

	ComponentParameter registrar(ComponentParameter componentParameter);
	ComponentParameter modificar(ComponentParameter componentParameter);
	List<ComponentParameter> listar();
	ComponentParameter listarPorId(Integer id);
	void eliminar(Integer id);
}
