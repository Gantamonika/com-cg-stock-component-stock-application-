package com.cg.stock.management.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.stock.management.demo.model.Investor;
import com.cg.stock.management.demo.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{

	@Query(name = "SELECT stockName FROM Stock WHERE companyName IN(SELECT companyName FROM Company where companyName = name)") // JPQL
	public abstract List<Stock> getStockByCompanyName(String name);
	
	@Query(name ="SELECT stockName FROM Stock WHERE Inverstor=inv")
	public abstract List<Stock> getStockByInvestor(Investor inv);

	public abstract List<Stock> viewAllGrowingStocks();
	
	public abstract List<Stock> viewAllReducingStocks();

}
