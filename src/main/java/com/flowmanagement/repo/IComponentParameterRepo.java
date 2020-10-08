package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.ComponentParameter;


public interface IComponentParameterRepo extends JpaRepository<ComponentParameter,Integer> {

}
