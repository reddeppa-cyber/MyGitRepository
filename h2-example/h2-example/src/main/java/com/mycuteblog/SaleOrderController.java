package com.mycuteblog;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycuteblog.model.SaleOrder;
import com.mycuteblog.service.impl.SaleOrderServiceImpl;

@RestController
@Configuration
public class SaleOrderController {
	
	 @Autowired
	    private SaleOrderServiceImpl service;

	    @
	    public String saveSalesOrder(@RequestBody SaleOrder saleOrder ) {
	        service.create(saleOrder);
	        return saleOrder.getOrderid()+ " Created Successfully...!";
	    }

	    @DeleteMapping("/delete/{orderId}")
	    public String deleteStudentById(@PathVariable("orderId") Integer orderId) {
	        service.deleteByOrderById(orderId);;
	        return orderId+ "Deleted Sucessfully";
	    }

	    @GetMapping("/getAll")
	    public List<StudentModel> getAllStd() {
	        return service.listAllStudents();
	    }

	    @GetMapping("/find/{stdId}")
	    public Optional<StudentModel> findByStydentId(@PathVariable("stdId") Integer stdId) {
	        return service.findByStudentId(stdId);
	    }

	
}
