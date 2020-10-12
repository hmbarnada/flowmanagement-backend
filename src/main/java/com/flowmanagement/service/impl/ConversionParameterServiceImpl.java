package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.ConversionParameter;
import com.flowmanagement.repo.IConversionParameterRepo;
import com.flowmanagement.service.IConversionParameterService;

@Service
public class ConversionParameterServiceImpl implements IConversionParameterService {

	@Autowired
	private IConversionParameterRepo repo;
	
	@Override
	public ConversionParameter add(ConversionParameter conversionParameter) {
		return repo.save(conversionParameter);
	}

	@Override
	public ConversionParameter update(ConversionParameter conversionParameter) {
		return repo.save(conversionParameter);
	}

	@Override
	public List<ConversionParameter> getAll() {
		return repo.findAll();
	}

	@Override
	public ConversionParameter getById(Integer id) {
		Optional<ConversionParameter> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ConversionParameter();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
