package com.duan.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.duan.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {

//	private static final String REEST_URL = "http://localhost:8001"; 
	private static final String REEST_URL = "http://microservicecloud-dept"; 
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping("/consumer/test")
	public String test() {
		return "测试consumer,端口是80";
	}
	
	@GetMapping("/consumer/getDept/{id}")
	public Dept getById(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REEST_URL + "/dept/get/"+id,Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/getAllDepts")
	public List<Dept> getAllDepts() {
		return restTemplate.getForObject(REEST_URL + "/dept/deptlist",List.class);
	}
	
	@PostMapping("/consumer/addDept")
	public boolean add (Dept dept) {
		return restTemplate.patchForObject(REEST_URL + "/dept/list", dept, Boolean.class);
	}
	
	//测试服务的发现@EnableDiscoveryClient
	@GetMapping("/consumer/dept/discovey")
	public Object discovery () {
		return restTemplate.patchForObject(REEST_URL + "/dept/discovey",null,Object.class);
	}
}



