package com.mycuteblog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "api_request")
public class SaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Integer orderid;
    @Column(name="request_time")
    private Date requestTime;
    @Column(name="customer")
    private String customer;
    @Column(name="price")
    private Double price;
	
    public SaleOrder() {
			}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
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
