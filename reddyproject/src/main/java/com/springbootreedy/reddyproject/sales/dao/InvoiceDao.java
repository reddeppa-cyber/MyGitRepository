package com.springbootreedy.reddyproject.sales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootreedy.reddyproject.sales.model.InvoiceModel;

@Repository
public interface InvoiceDao extends JpaRepository<InvoiceModel, Integer> {

}
