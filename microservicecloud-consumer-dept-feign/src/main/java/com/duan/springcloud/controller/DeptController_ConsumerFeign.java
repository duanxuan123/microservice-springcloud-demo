package com.duan.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duan.springcloud.entities.Dept;
import com.duan.springcloud.service.DeptClientService;

@RestController
public class DeptController_ConsumerFeign {

	@Autowired
    private DeptClientService service;
	
	@RequestMapping("/consumer/test")
	public String test() {
		return "测试consumer-dept-feign,端口是80";
	}
	
	@GetMapping("/consumer/getDept/{id}")
	public Dept getById(@PathVariable("id") Long id) {
		return service.getById(id);
	}
	
	@RequestMapping("/consumer/getAllDepts")
	public List<Dept> getAllDepts() {
		return this.service.getAllDepts();
	}

}



