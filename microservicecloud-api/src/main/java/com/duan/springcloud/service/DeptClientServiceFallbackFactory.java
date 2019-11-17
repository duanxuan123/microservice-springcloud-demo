package com.duan.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.duan.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public Dept getById(Long id) {
				Dept fal = new Dept();
				fal.setDeptno(id);
				fal.setDname("DeptClientServiceFallbackFactory");
				fal.setDb_source("@HystrixCommand-FallbackFactory熔断保护");
				return fal;
			}
			
			@Override
			public List<Dept> getAllDepts() {
				List<Dept> falList = new ArrayList<>();
				return falList;
			}
		};
	}

}
