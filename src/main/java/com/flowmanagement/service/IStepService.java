package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Step;

public interface IStepService {
	Step registrar(Step step);
	Step modificar(Step step);
	List<Step> listar();
	Step listarPorId(Integer id);
	void eliminar(Integer id);
}
