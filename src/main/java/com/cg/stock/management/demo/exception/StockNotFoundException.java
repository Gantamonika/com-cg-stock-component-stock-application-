package com.cg.stock.management.demo.exception;

public class StockNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StockNotFoundException() {
		super();
	}

	public StockNotFoundException(String message) {
		super(message);
	}
	
}
