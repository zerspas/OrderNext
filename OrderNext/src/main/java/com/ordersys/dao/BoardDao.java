package com.ordersys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ordersys.entity.Board;
@Mapper
public interface BoardDao {
	public List<Board>findList();
	public int add(Board board);
	public int delete (int id);
	public int update(Board board);
	public Board findById(int id);

}
