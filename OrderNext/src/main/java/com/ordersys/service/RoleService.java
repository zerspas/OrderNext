package com.ordersys.service;

import com.ordersys.entity.Role;

public interface RoleService {
	/**
	 * 根据ID查询角色
	 * @param id
	 * @return
	 */
	public Role findById(int id);
}
