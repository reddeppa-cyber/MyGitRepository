package com.springbootreedy.reddyproject.sales.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootreedy.reddyproject.sales.model.SaleOrder;


@Service
public interface SaleOrderService {
	public Integer create(SaleOrder salesOrder);
    public List<SaleOrder> listAllOrders();
    public SaleOrder findByOrderId(Integer orderId);
    public void deleteByOrderById(Integer orderId);

}
