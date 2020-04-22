package com.springbootreedy.reddyproject;

import org.springframework.stereotype.Component;

@Component
public class SalesConfiguration {
	
	public static final String SALES_CREATE = "/save";
	public static final String SALES_DELETE = "/delete";
	public static final String LIST_ALL_SALES = "/getAll";
	public static final String GET_SALE = "/find";
	public static final String GENERATE_INVOICE = "/generate/invoice";
	public static final String SALES_UPDATE="/update";
}
