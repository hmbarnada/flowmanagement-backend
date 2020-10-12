package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.ConditionType;
import com.flowmanagement.repo.IConditionTypeRepo;
import com.flowmanagement.service.IConditionTypeService;

@Service
public class ConditionTypeServiceImpl implements IConditionTypeService {
	
	@Autowired
	private IConditionTypeRepo repo;
	
	@Override
	public ConditionType add(ConditionType conditionType) {
		return repo.save(conditionType);
	}

	@Override
	public ConditionType update(ConditionType conditionType) {
		return repo.save(conditionType);
	}

	@Override
	public List<ConditionType> getAll() {
		return repo.findAll();
	}

	@Override
	public ConditionType getById(Integer id) {
		Optional<ConditionType> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ConditionType();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
