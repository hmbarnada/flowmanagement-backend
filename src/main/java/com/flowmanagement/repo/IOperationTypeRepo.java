package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.OperationType;

public interface IOperationTypeRepo extends JpaRepository<OperationType,Integer>{

}
