package com.duan.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duan.springcloud.entities.Dept;
import com.duan.springcloud.service.DeptService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"handler"})
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/test")
	public String test() {
		return "测试8001服务提供者接口";
	}
	
	@PostMapping("/dept/add")
	public boolean add(Dept dept) {
		return deptService.add(dept);
	}
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}
	
	@GetMapping("/dept/deptlist")
	public List<Dept> deptList() {
		return deptService.getlist();
	}
	
	@GetMapping("/dept/discovey")
	public Object discovery() {
		List<String> lists = discoveryClient.getServices();
		System.out.println("~~~~~~~~~~~~~~~"+lists+"~~~~~~~~~~~~~~~~~");
		List<ServiceInstance> srvLists = discoveryClient.getInstances("microservicecloud-dept");
		for (ServiceInstance serviceInstance : srvLists) {
			System.out.println(serviceInstance.getHost()+"端口是："+serviceInstance.getPort()+"url是：："+serviceInstance.getUri());
			System.out.println(serviceInstance.getServiceId());
		}
		return this.discoveryClient;
	}
	
	
}





