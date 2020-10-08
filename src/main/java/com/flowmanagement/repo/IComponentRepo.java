package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Component;

public interface IComponentRepo extends JpaRepository<Component,Integer>{

}
