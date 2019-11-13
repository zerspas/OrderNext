package com.ordersys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ordersys.entity.Login;

/**
 * 持久化接口
 * @author Administrator
 *
 */
@Mapper
public interface LoginDao {
	/**
	 * 登录
	 * @param roleId
	 * @return
	 */
	public Login find(String name);
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
