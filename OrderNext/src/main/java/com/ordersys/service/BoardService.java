package com.ordersys.service;

import java.util.List;

import com.ordersys.entity.Board;

public interface BoardService {
	public List<Board>findList();
	public int add(Board board);
	public int delete (int id);
	public int update(Board board);
	public Board findById(int id);

}
