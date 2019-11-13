package com.ordersys.service;

import java.util.List;

import com.ordersys.entity.Login;
/**
 * 实现类接口
 * @author Administrator
 *
 */
public interface LoginService {
	/**
	 * 登录
	 * @param roleId
	 * @return
	 */
	public int find(String name,String password);
	/**
	 * 跳转名称
	 * @param id
	 * @return
	 */
	public String findName(int id);
	/**
	 * 查询所有
	 * @return
	 */
	public List<Login> list();
	/**
	 * 添加管理
	 * @param login
	 * @return
	 */
	public int add(Login login);
}
