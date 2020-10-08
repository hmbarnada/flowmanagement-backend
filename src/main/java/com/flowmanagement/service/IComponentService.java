package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Component;

public interface IComponentService {

	Component registrar(Component component);
	Component modificar(Component component);
	List<Component> listar();
	Component listarPorId(Integer id);
	void eliminar(Integer id);
}
