package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.ConversionParameter;


public interface IConversionParameterRepo extends JpaRepository<ConversionParameter,Integer> {

}
