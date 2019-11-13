package com.ordersys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersys.dao.LoginDao;
import com.ordersys.entity.Login;
import com.ordersys.entity.Role;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao dao;
	public int find(String name, String password) {
		Login login=dao.find(name);
		if(login!=null) {
			if(password.equals(login.getPassword())) {
				return login.getRoleId();
			}
		}	
		return -1;
	}
	public String findName(int id) {
		return dao.findName(id);
	}

	public List<Login> list() {
		return dao.list();
	}

	public int add(Login login) {
		return dao.add(login);
	}

}
