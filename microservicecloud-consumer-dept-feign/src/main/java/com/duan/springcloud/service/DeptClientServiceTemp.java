package com.duan.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duan.springcloud.entities.Dept;
/**
 * 临时测试temp
 * @author DXuan
 *
 */

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientServiceTemp {

//	@GetMapping("/dept/deptlist")
//	public List<Dept> getAllDepts();
	
}
