package com.ordersys.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersys.dao.BoardDao;
import com.ordersys.entity.Board;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDao dao;
	
	@Override
	public List<Board> findList() {
		return dao.findList();
	}

	@Override
	public int add(Board board) {
		return dao.add(board);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

	@Override
	public int update(Board board) {
		return dao.update(board);
	}

	@Override
	public Board findById(int id) {
		return dao.findById(id);
	}

}
