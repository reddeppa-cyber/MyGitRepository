package com.springbootreedy.reddyproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springbootreedy.reddyproject.sales.dao.SaleOrderDao;
import com.springbootreedy.reddyproject.sales.model.SaleOrder;
import com.springbootreedy.reddyproject.sales.service.SaleOrderService;

@SpringBootTest
public class SalesOrderServiceTest {

	@Autowired
	SaleOrderDao saleOrderDao;

	@Autowired
	SaleOrderService saleOrderServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void testCreateSalesOrder() throws ParseException {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z
		// yyyy");
		SaleOrder salesOrder = new SaleOrder();
		salesOrder.setPrice(40d);
		salesOrder.setCustomer("Reddy");
		salesOrder.setRequestTime("2020.04.18.09.23.22");
		Integer salesId = saleOrderServiceImpl.create(salesOrder);
		assertNotNull(salesId);
	}

	@Test
	public void testlistAllOrders() throws ParseException {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z
		// yyyy");
		List<SaleOrder> list = new ArrayList<SaleOrder>();
		when(saleOrderServiceImpl.listAllOrders()).thenReturn(list);
		List<SaleOrder> empList = saleOrderServiceImpl.listAllOrders();
		assertEquals(3, empList.size());
	}

	@Test
	public void tesfindByOrderId() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");

		SaleOrder saleOrder = saleOrderServiceImpl.findByOrderId(1);

		assertEquals("Reddy", saleOrder.getCustomer());
		assertEquals(dateFormat.parse("Thu Apr 09 13:01:21 IST 2020"), saleOrder.getRequestTime());
	}

}
