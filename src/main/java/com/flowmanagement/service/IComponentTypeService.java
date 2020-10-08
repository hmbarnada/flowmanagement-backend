package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.ComponentType;

public interface IComponentTypeService {
	ComponentType registrar(ComponentType componentType);
	ComponentType modificar(ComponentType componentType);
	List<ComponentType> listar();
	ComponentType listarPorId(Integer id);
	void eliminar(Integer id);
}
