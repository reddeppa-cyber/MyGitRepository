package com.springbootreedy.reddyproject.sales.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootreedy.reddyproject.SalesConfiguration;
import com.springbootreedy.reddyproject.sales.model.InvoiceModel;
import com.springbootreedy.reddyproject.sales.model.SaleOrder;
import com.springbootreedy.reddyproject.sales.serviceimpl.InvoiceServiceImpl;
import com.springbootreedy.reddyproject.sales.serviceimpl.SaleOrderServiceImpl;

@RestController
public class SaleOrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SaleOrderController.class);

	@Autowired
	private SaleOrderServiceImpl service;

	@Autowired
	private InvoiceServiceImpl invoiceService;

	@PostMapping(SalesConfiguration.SALES_CREATE)
	public String saveSalesOrder(@RequestBody SaleOrder saleOrder) {
		try {
			service.create(saleOrder);
			InvoiceModel invoiceModel = new InvoiceModel();
			invoiceModel.setInvoiceNumber(saleOrder.getOrderid());
			invoiceModel.setBillAmout(saleOrder.getPrice());
			invoiceModel.setBillDate(saleOrder.getRequestTime());
			invoiceService.createInvoice(invoiceModel);
			return saleOrder.getOrderid() + " Created Successfully...!";

		} catch (Exception e) {
			LOGGER.error("saveSalesOrder():error", e);
		}
		return null;
	}

	@DeleteMapping(SalesConfiguration.SALES_DELETE + "/{orderId}")
	public String deleteSaleOrderById(@PathVariable("orderId") Integer orderId) {
		try {
			service.deleteByOrderById(orderId);
			return orderId + "Deleted Sucessfully";
		} catch (Exception e) {
			LOGGER.error("deleteSaleOrderById():error", e);
		}
		return null;
	}

	@GetMapping(SalesConfiguration.LIST_ALL_SALES)
	public List<SaleOrder> getAllOrders() {
		try {
			return service.listAllOrders();
		} catch (Exception e) {
			LOGGER.error("getAllOrders():error", e);
		}
		return null;
	}

	@GetMapping(SalesConfiguration.GET_SALE + "/{orderId}")
	public SaleOrder findSalrOrderById(@PathVariable("orderId") Integer orderId) {
		try {
			return service.findByOrderId(orderId);

		} catch (Exception e) {
			LOGGER.error("findSalrOrderById():error", e);
		}
		return null;
	}

	@PutMapping(SalesConfiguration.SALES_UPDATE)
	private String update(@RequestBody SaleOrder saleOrder) {
		try {
			service.create(saleOrder);
			return saleOrder.getOrderid() + " is modified";
		} catch (Exception e) {
			LOGGER.error("update():error", e);

		}
		return null;

	}

}
