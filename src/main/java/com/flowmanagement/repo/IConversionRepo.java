package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Conversion;

public interface IConversionRepo extends JpaRepository<Conversion,Integer> {

}
