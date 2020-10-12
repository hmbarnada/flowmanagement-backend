package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.ConditionParameter;
import com.flowmanagement.repo.IConditionParameterRepo;
import com.flowmanagement.service.IConditionParameterService;

@Service
public class ConditionParameterServiceImpl implements IConditionParameterService{

	@Autowired
	private IConditionParameterRepo repo;
	
	@Override
	public ConditionParameter add(ConditionParameter conditionParameter) {
		return repo.save(conditionParameter);
	}

	@Override
	public ConditionParameter update(ConditionParameter conditionParameter) {
		return repo.save(conditionParameter);
	}

	@Override
	public List<ConditionParameter> getAll() {
		return repo.findAll();
	}

	@Override
	public ConditionParameter getById(Integer id) {
		Optional<ConditionParameter> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ConditionParameter();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
