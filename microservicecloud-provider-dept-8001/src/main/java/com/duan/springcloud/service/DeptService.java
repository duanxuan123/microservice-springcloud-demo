package com.duan.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duan.springcloud.entities.Dept;

@Service
public interface DeptService {

	boolean add(Dept dept);
	Dept get(Long id);
	List<Dept> getlist();
}
