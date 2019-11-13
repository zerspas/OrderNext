package com.ordersys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ordersys.entity.Board;
import com.ordersys.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("list")
	public String find(Model model) {
		List<Board> list=service.findList();
		model.addAttribute("list",list);
		return "boardList";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add() {
		return "saveBoard";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(Board board) {
		service.add(board);
		return "redirect:list";
	}
	@RequestMapping("delete")
	public String delete(int id) {
		service.delete(id);
		return "redirect:list";
	}
	
	@RequestMapping("update")
	public String update(@RequestParam int id,Model model) {
		Board board=service.findById(id);
		service.update(board);
		model.addAttribute("board",board);
		return "redirect:list";
	}
	/**
	 * 主页面组合top、left、right、bottom
	 * @param model
	 * @return
	 */
	@RequestMapping("top")
	public String top(Model model) {
		return "top";
	}
	
	@RequestMapping("left")
	public String left(Model model) {
		return "left";
	}
	
	@RequestMapping("right")
	public String right(Model model) {
		return "right";
	}
	
	@RequestMapping("bottom")
	public String bottom(Model model) {
		return "bottom";
	}

	/*
	 * @RequestMapping("update") public String update(Board board) {
	 * service.update(board); return "forward:list"; }
	 */

	
}
