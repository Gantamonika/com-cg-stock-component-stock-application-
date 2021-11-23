package com.cg.stock.management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.stock.management.demo.model.Investor;

public interface InvestorRepository extends JpaRepository<Investor, Integer>{

}
