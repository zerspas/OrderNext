package com.ordersys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ordersys.entity.Role;

@Mapper
public interface RoleDao {
	/**
	 * 根据ID查询角色
	 * @param id
	 * @return
	 */
	public Role findById(int id);
}
