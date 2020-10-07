package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Guide;

public interface IGuideService {
	
	Guide registrar(Guide guide);
	Guide modificar(Guide guide);
	List<Guide> listar();
	Guide listarPorId(Integer id);
	void eliminar(Integer id);
}
