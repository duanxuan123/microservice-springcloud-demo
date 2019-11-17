package com.duan.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.duan.springcloud.entities.Dept;

@FeignClient(value = "microservicecloud-dept" ,fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	public static final String REEST_URL = "http://microservicecloud-dept"; 

	@GetMapping("/dept/get/{id}")
	public Dept getById(@PathVariable("id") Long id);

	@GetMapping("/dept/deptlist")
	public List<Dept> getAllDepts();

}
