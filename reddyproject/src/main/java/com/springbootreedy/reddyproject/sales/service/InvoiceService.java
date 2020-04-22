package com.springbootreedy.reddyproject.sales.service;

import java.util.List;
import java.util.Optional;

import com.springbootreedy.reddyproject.sales.model.InvoiceModel;

public interface InvoiceService {
	
	public List<InvoiceModel> listAllInvoices();
	public Optional<InvoiceModel> getInvoiceById(Integer invoiceNumber);
	public Integer createInvoice(InvoiceModel invoiceModel);
	public String deleteInvoiceById(Integer invoiceNumber);
}
