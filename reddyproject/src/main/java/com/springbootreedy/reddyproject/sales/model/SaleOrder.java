package com.springbootreedy.reddyproject.sales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "api_request")
public class SaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Integer orderid;
    @Column(name="request_time")
    private String requestTime;
    @Column(name="customer")
    private String customer;
    @Column(name="price")
    private Double price;
	
    public SaleOrder() {
			}

	public SaleOrder(Integer orderid, String requestTime,String customer,Double price) {
		this.orderid=orderid;
		this.requestTime=requestTime;
		this.customer=customer;
		this.price=price;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SaleOrder [orderid=" + orderid + ", requestTime=" + requestTime + ", customer=" + customer + ", price="
				+ price + "]";
	}
    
    
}
