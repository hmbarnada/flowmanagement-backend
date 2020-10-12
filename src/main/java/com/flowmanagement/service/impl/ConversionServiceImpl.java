package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Conversion;
import com.flowmanagement.repo.IConversionRepo;
import com.flowmanagement.service.IConversionService;

@Service
public class ConversionServiceImpl implements IConversionService {

	@Autowired
	private IConversionRepo repo;
	
	@Override
	public Conversion add(Conversion conversion) {
		return repo.save(conversion);
	}

	@Override
	public Conversion update(Conversion conversion) {
		return repo.save(conversion);
	}

	@Override
	public List<Conversion> getAll() {
		return repo.findAll();
	}

	@Override
	public Conversion getById(Integer id) {
		Optional<Conversion> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Conversion();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
