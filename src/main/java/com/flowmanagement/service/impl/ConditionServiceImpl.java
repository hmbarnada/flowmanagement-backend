package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Condition;
import com.flowmanagement.repo.IConditionRepo;
import com.flowmanagement.service.IConditionService;

@Service
public class ConditionServiceImpl implements IConditionService{

	@Autowired
	private IConditionRepo repo;
	
	@Override
	public Condition registrar(Condition condition) {
		return repo.save(condition);
	}

	@Override
	public Condition modificar(Condition condition) {
		return repo.save(condition);
	}

	@Override
	public List<Condition> listar() {
		return repo.findAll();
	}

	@Override
	public Condition listarPorId(Integer id) {
		Optional<Condition> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Condition();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
