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
	public Guide add(Guide guide) {
		return repo.save(guide);
	}

	@Override
	public Guide update(Guide guide) {
		return repo.save(guide);
	}

	@Override
	public List<Guide> getAll() {
		return repo.findAll();
	}

	@Override
	public Guide getById(Integer id) {
		Optional<Guide> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Guide();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
