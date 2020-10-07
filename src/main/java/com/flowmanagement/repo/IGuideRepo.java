package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Guide;

public interface IGuideRepo extends JpaRepository<Guide,Integer>{

}
