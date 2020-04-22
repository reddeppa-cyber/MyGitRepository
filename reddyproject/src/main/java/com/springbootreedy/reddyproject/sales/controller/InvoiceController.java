package com.springbootreedy.reddyproject.sales.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import com.springbootreedy.reddyproject.SalesConfiguration;
import com.springbootreedy.reddyproject.sales.model.InvoiceModel;
import com.springbootreedy.reddyproject.sales.serviceimpl.InvoiceServiceImpl;

@RestController
public class InvoiceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceController.class);

	@Autowired
	private InvoiceServiceImpl invoiceService;

	@GetMapping(SalesConfiguration.GENERATE_INVOICE + "/{invoiceNumber}")
	public Optional<InvoiceModel> getInvoice(@PathVariable("invoiceNumber") Integer invoiceNumber) {
		try {
			Optional<InvoiceModel> invoiceSer = invoiceService.getInvoiceById(invoiceNumber);
			return invoiceSer;
		} catch (Exception e) {
			LOGGER.error("getInvoice(): Error", e);
		}
		return null;
	}

}
