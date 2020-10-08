package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Step;
import com.flowmanagement.repo.IStepRepo;
import com.flowmanagement.service.IStepService;

@Service
public class StepServiceImpl implements IStepService{
	
	@Autowired
	private IStepRepo repo;
	
	@Override
	public Step registrar(Step guide) {
		return repo.save(guide);
	}

	@Override
	public Step modificar(Step guide) {
		return repo.save(guide);
	}

	@Override
	public List<Step> listar() {
		return repo.findAll();
	}

	@Override
	public Step listarPorId(Integer id) {
		Optional<Step> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Step();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
