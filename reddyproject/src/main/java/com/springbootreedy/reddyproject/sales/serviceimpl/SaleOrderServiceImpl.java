package com.springbootreedy.reddyproject.sales.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootreedy.reddyproject.sales.dao.SaleOrderDao;
import com.springbootreedy.reddyproject.sales.model.SaleOrder;
import com.springbootreedy.reddyproject.sales.service.SaleOrderService;

@Service
public class SaleOrderServiceImpl implements SaleOrderService {

	@Autowired
	private SaleOrderDao salesOrderRepo;

	@Override
	public Integer create(SaleOrder salesOrder) {
		return salesOrderRepo.save(salesOrder).getOrderid();
	}

	@Override
	public List<SaleOrder> listAllOrders() {
		List<SaleOrder> list = new ArrayList<SaleOrder>();
		list = salesOrderRepo.findAll();
		return list;
	}

	@Override
	public SaleOrder findByOrderId(Integer orderId) {
		return salesOrderRepo.findById(orderId).orElseThrow(EntityNotFoundException::new);
	}

	@Override
	public void deleteByOrderById(Integer orderId) {
		salesOrderRepo.deleteById(orderId);
	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateOnly.format(cal.getTime()));
	}

}
