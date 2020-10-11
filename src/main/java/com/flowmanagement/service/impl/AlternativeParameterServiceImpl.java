package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.AlternativeParameter;
import com.flowmanagement.repo.IAlternativeParameterRepo;
import com.flowmanagement.service.IAlternativeParameterService;

@Service
public class AlternativeParameterServiceImpl implements IAlternativeParameterService{

	@Autowired
	private IAlternativeParameterRepo repo;
	
	@Override
	public AlternativeParameter registrar(AlternativeParameter alternativeParameter) {
		return repo.save(alternativeParameter);
	}

	@Override
	public AlternativeParameter modificar(AlternativeParameter alternativeParameter) {
		return repo.save(alternativeParameter);
	}

	@Override
	public List<AlternativeParameter> listar() {
		return repo.findAll();
	}

	@Override
	public AlternativeParameter listarPorId(Integer id) {
		Optional<AlternativeParameter> op = repo.findById(id);
		return op.isPresent() ? op.get() : new AlternativeParameter();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
