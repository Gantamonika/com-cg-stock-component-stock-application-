package com.cg.stock.management.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Stock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1199218719281064116L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;
	
	@Column
	private String stockName;
	
	@OneToOne
	@JoinColumn(name = "investorId")
	private Investor investor;
	
	@OneToOne
	@JoinColumn(name = "companyId")
	private Company company;
	
	@Column
	private int quantity;
	
	@Column
	private String type;
	
	@Column
	private double avgPrice;
	
	@Column
	private int localStock;
	
	@Column
	private double profitLoss;
	
	@Column
	private String status;
	
	public Stock() {
		
		super();
		
	}
	
	public Stock(int stockId, String stockName, Investor investor, Company company, int quantity, String type,
			double avgPrice, int localStock, double profitLoss, String status) {
		
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.investor = investor;
		this.company = company;
		this.quantity = quantity;
		this.type = type;
		this.avgPrice = avgPrice;
		this.localStock = localStock;
		this.profitLoss = profitLoss;
		this.status = status;
	}
	
	public int getStockId() {
		return stockId;
	}
	
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	
	public String getStockName() {
		return stockName;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public Investor getInvestor() {
		return investor;
	}
	
	public void setInvestor(Investor investor) {
		this.investor = investor;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getAvgPrice() {
		return avgPrice;
	}
	
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}
	
	public int getLocalStock() {
		return localStock;
	}
	
	public void setLocalStock(int localStock) {
		this.localStock = localStock;
	}
	
	public double getProfitLoss() {
		return profitLoss;
	}
	
	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", investor=" + investor + ", company="
				+ company + ", quantity=" + quantity + ", type=" + type + ", avgPrice=" + avgPrice + ", localStock="
				+ localStock + ", profitLoss=" + profitLoss + ", status=" + status + "]";
	}


}
