package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.OperationParameter;

public interface IOperationParameterRepo extends JpaRepository<OperationParameter,Integer>{

}
