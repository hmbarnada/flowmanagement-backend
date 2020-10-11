package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.ConditionParameter;

public interface IConditionParameterRepo extends JpaRepository<ConditionParameter,Integer>{

}
