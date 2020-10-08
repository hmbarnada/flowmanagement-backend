package com.flowmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowmanagement.model.Alternative;

public interface IAlternativeRepo extends JpaRepository<Alternative,Integer>{

}
