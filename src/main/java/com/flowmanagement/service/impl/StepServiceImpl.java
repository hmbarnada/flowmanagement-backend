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
	public Step add(Step guide) {
		return repo.save(guide);
	}

	@Override
	public Step update(Step guide) {
		return repo.save(guide);
	}

	@Override
	public List<Step> getAll() {
		return repo.findAll();
	}

	@Override
	public Step getById(Integer id) {
		Optional<Step> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Step();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
