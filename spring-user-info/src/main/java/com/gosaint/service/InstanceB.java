package com.gosaint.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InstanceB {

	@Autowired
	private InstanceA instanceA;
}
