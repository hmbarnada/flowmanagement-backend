package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.AlternativeParameter;

public interface IAlternativeParameterRepo extends JpaRepository<AlternativeParameter,Integer>{

}
