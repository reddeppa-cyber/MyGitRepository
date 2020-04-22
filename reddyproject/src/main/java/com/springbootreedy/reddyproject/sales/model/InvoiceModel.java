package com.springbootreedy.reddyproject.sales.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="invoice")
public class InvoiceModel {

	@Id
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Integer invoiceNumber;
	private String billDate;
	private Double billAmout;
	
	public InvoiceModel() {
		super();
	}
	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public Double getBillAmout() {
		return billAmout;
	}
	public void setBillAmout(Double billAmout) {
		this.billAmout = billAmout;
	}
	@Override
	public String toString() {
		return "InvoiceModel [invoiceNumber=" + invoiceNumber + ", billDate=" + billDate + ", billAmout=" + billAmout
				+ "]";
	}
	
	
	
}
