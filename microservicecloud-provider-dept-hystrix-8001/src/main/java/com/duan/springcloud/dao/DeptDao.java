package com.duan.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.duan.springcloud.entities.Dept;

@Mapper 
public interface DeptDao {
	boolean add(Dept dept);

	Dept getById(Long id);

	List<Dept> getAllDpet();
}
