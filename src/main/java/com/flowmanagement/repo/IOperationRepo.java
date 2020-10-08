package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Operation;

public interface IOperationRepo extends JpaRepository<Operation,Integer>{

}
