package com.ordersys.service;

import org.springframework.stereotype.Service;

import com.ordersys.dao.RoleDao;
import com.ordersys.entity.Role;
@Service
public class RoleServiceImpl implements RoleService{

	RoleDao dao;
	public Role findById(int id) {
		return dao.findById(id);
	}

}
