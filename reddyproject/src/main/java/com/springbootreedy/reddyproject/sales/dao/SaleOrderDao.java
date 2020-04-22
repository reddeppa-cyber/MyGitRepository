package com.springbootreedy.reddyproject.sales.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleOrderDao extends JpaRepository<com.springbootreedy.reddyproject.sales.model.SaleOrder, Integer> {

}
