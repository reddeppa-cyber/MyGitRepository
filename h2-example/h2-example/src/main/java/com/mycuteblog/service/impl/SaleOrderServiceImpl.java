package com.mycuteblog.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycuteblog.dao.SaleOrderDao;
import com.mycuteblog.model.SaleOrder;
import com.mycuteblog.serviced.SaleOrderService;

@Service
public class SaleOrderServiceImpl implements SaleOrderService {
	
	@Autowired
	private SaleOrderDao salesOrderRepo;

	@Override
	public Integer create(SaleOrder salesOrder) {
		// TODO Auto-generated method stub
		return salesOrderRepo.save(salesOrder).getOrderid();
	}

	@Override
	public List<SaleOrder> listAllOrders() {
		// TODO Auto-generated method stub
		return salesOrderRepo.findAll();
	}

	@Override
	public SaleOrder findByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return salesOrderRepo.findOne(orderId);
	}

	@Override
	public void deleteByOrderById(Integer orderId) {
		// TODO Auto-generated method stub
		salesOrderRepo.delete(orderId);
	}

	      }
