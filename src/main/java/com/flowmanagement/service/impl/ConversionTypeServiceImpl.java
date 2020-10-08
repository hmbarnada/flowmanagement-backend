package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.ConversionType;
import com.flowmanagement.repo.IConversionTypeRepo;
import com.flowmanagement.service.IConversionTypeService;

@Service
public class ConversionTypeServiceImpl implements IConversionTypeService{
	@Autowired
	private IConversionTypeRepo repo;
	
	@Override
	public ConversionType registrar(ConversionType conversionType) {
		return repo.save(conversionType);
	}

	@Override
	public ConversionType modificar(ConversionType conversionType) {
		return repo.save(conversionType);
	}

	@Override
	public List<ConversionType> listar() {
		return repo.findAll();
	}

	@Override
	public ConversionType listarPorId(Integer id) {
		Optional<ConversionType> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ConversionType();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
