package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Step;

public interface IStepRepo extends JpaRepository<Step,Integer>{

}
