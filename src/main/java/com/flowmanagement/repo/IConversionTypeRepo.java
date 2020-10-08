package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.ConversionType;


public interface IConversionTypeRepo extends JpaRepository<ConversionType,Integer> {

}
