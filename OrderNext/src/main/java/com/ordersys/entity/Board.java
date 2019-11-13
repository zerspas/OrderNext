package com.ordersys.entity;

public class Board {
	private int id;
	private String tableName;
	private String tableStatus;
	private String orderDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableStatus() {
		return tableStatus;
	}
	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}
