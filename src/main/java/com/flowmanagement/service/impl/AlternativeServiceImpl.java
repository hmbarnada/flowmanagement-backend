package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Alternative;
import com.flowmanagement.repo.IAlternativeRepo;
import com.flowmanagement.service.IAlternativeService;

@Service
public class AlternativeServiceImpl implements IAlternativeService {

	@Autowired
	private IAlternativeRepo repo;
	
	@Override
	public Alternative registrar(Alternative alternative) {
		return repo.save(alternative);
	}

	@Override
	public Alternative modificar(Alternative alternative) {
		return repo.save(alternative);
	}

	@Override
	public List<Alternative> listar() {
		return repo.findAll();
	}

	@Override
	public Alternative listarPorId(Integer id) {
		Optional<Alternative> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Alternative();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
