package com.duan.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duan.springcloud.dao.DeptDao;
import com.duan.springcloud.entities.Dept;
import com.duan.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return deptDao.add(dept);
	}

	@Override
	public Dept get(Long id) {
		// TODO Auto-generated method stub
		return deptDao.getById(id);
	}

	@Override
	public List<Dept> getlist() {
		// TODO Auto-generated method stub
		return deptDao.getAllDpet();
	}

}
