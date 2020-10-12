package com.flowmanagement.service;

import java.util.List;

import com.flowmanagement.model.Guide;

public interface IGuideService {
	
	Guide add(Guide guide);
	Guide update(Guide guide);
	List<Guide> getAll();
	Guide getById(Integer id);
	void delete(Integer id);
}
