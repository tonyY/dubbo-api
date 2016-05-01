package com.tony.dubbo.service;

public class CustomerServiceImpl implements CustomerService {

	public String getName() {
		System.out.println("remote method~~~~");
		return "CustomerServiceImpl=====>getName";
	}

}
