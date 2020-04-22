package com.mycuteblog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycuteblog.model.SaleOrder;

@Repository
public interface SaleOrderDao extends JpaRepository<SaleOrder, Integer> {

}
