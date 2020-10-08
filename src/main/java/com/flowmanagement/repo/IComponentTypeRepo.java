package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.ComponentType;

public interface IComponentTypeRepo extends JpaRepository<ComponentType,Integer>{

}
