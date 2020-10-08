package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Alternative;

public interface IAlternativeService {

	Alternative registrar(Alternative alternative);
	Alternative modificar(Alternative alternative);
	List<Alternative> listar();
	Alternative listarPorId(Integer id);
	void eliminar(Integer id);
}
