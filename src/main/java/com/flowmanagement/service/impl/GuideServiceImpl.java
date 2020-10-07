package com.flowmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowmanagement.model.Guide;
import com.flowmanagement.repo.IGuideRepo;
import com.flowmanagement.service.IGuideService;

@Service
public class GuideServiceImpl implements IGuideService{

	@Autowired
	private IGuideRepo repo;
	
	@Override
	public Guide registrar(Guide guide) {
		return repo.save(guide);
	}

	@Override
	public Guide modificar(Guide guide) {
		return repo.save(guide);
	}

	@Override
	public List<Guide> listar() {
		return repo.findAll();
	}

	@Override
	public Guide listarPorId(Integer id) {
		Optional<Guide> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Guide();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
