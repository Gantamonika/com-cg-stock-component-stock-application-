package com.cg.stock.management.demo.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.stock.management.demo.exception.CompanyNotFoundException;
import com.cg.stock.management.demo.exception.StockNotFoundException;
import com.cg.stock.management.demo.model.Investor;
import com.cg.stock.management.demo.model.Stock;
import com.cg.stock.management.demo.repository.CompanyRepository;
import com.cg.stock.management.demo.repository.InvestorRepository;
import com.cg.stock.management.demo.repository.StockRepository;



@Service
public class StockServices {
	
	private static final Logger LOG = LoggerFactory.getLogger(StockServices.class);
	
	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private InvestorRepository investorRepository;
	
	
	public Stock addStockDetails(Stock stock) throws CompanyNotFoundException{
		
		LOG.info("Service addStockDetails");
		if (stockRepository.existsById(stock.getCompany().getCompanyId()))	
			return  stockRepository.save(stock);
		else
			throw new CompanyNotFoundException(stock.getStockId() + " this company is not found.");
	}
	
	
	public Stock updateStockDetails(Stock stock) throws StockNotFoundException{
		
		LOG.info("Service updateStockDetails");
		if (stockRepository.existsById(stock.getStockId()))
			return stockRepository.save(stock);
		else	
		throw new StockNotFoundException(stock.getStockId() + " does not exist.");	
	}
	
	
	public Stock removeStockDetails(Stock stock) throws StockNotFoundException {
		
		LOG.info("removeStockDetails");
		Optional<Stock> stkOpt = stockRepository.findById(stock.getStockId());
		if (stkOpt.isPresent()) {
			stockRepository.deleteById(stock.getStockId());
			return stkOpt.get();
		} 
		else {
			throw new StockNotFoundException(stock.getStockId() + " this stock does not exist.");
		}
	}
	
	
	public List<Stock> viewStockDetails(Stock stock) {
		System.out.println("Service viewStockDetails");
		return stockRepository.findAll();
	}
	
//public List<Stock> viewStockDetails(Stock stock) {
//		
//		LOG.info("Service viewStockDetails");
//		Optional<Stock> stkOpt = stockRepository.findById(stock.getStockId());
//
//		if(stkOpt.isPresent()) {
//		stockRepository.findAll();
//		return viewStockDetails(stock);
//		}
//		else {
//			throw new StockNotFoundException(stock.getStockId() + " this stock does not exist.");
//		}
//	}

	public List<Stock> viewStockByCompanyName(String name){
		System.out.println("Service viewStockByCompanyName");
		return null;//stockRepository.findByCompanyName(name);

	}
	
	public List<Stock> viewStockByInvestor(Investor inv){
		System.out.println("Service viewStockByInvestor");
		return null;//stockRepository.findByInvestor(inv);

	}


}
