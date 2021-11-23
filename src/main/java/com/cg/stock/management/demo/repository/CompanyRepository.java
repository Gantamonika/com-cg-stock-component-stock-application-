package com.cg.stock.management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.stock.management.demo.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
