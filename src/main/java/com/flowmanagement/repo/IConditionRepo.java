package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Condition;

public interface IConditionRepo extends JpaRepository<Condition,Integer> {

}
