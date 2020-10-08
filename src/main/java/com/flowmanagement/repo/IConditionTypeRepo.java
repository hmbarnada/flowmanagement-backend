package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.ConditionType;


public interface IConditionTypeRepo extends JpaRepository<ConditionType,Integer>{

}
