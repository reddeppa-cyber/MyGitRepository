package com.springbootreedy.reddyproject.sales.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootreedy.reddyproject.sales.dao.InvoiceDao;
import com.springbootreedy.reddyproject.sales.model.InvoiceModel;
import com.springbootreedy.reddyproject.sales.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	private InvoiceDao invoiceDao;

	@Override
	public List<InvoiceModel> listAllInvoices() {
		return invoiceDao.findAll();
	}

	@Override
	public Optional<InvoiceModel> getInvoiceById(Integer invoiceNumber) {
		return invoiceDao.findById(invoiceNumber);
	}

	@Override
	public Integer createInvoice(InvoiceModel invoiceModel) {
		return invoiceDao.save(invoiceModel).getInvoiceNumber();
	}

	@Override
	public String deleteInvoiceById(Integer invoiceNumber) {
		if(invoiceNumber != null) {
			 invoiceDao.deleteById(invoiceNumber);
			 return invoiceNumber +"deleted Successfully...!";
		} else {
			return invoiceNumber +"Not Exists.";
		}
	}

}
