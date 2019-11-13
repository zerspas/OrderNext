package com.ordersys.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ordersys.entity.Login;
import com.ordersys.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginControllor {
	@Autowired
	LoginService service;
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login(Model model) {
		return "login-page";
	}
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String login(String name,String password,Model model) {
		int id=service.find(name, password);
		String TypeName=service.findName(id);
		if(id==1) {
			model.addAttribute("TypeName",TypeName);
			return "index";
		}else if(id==2){
			model.addAttribute("TypeName",TypeName);
			return "2";
		}else if(id==3) {
			model.addAttribute("TypeName",TypeName);
			return "3";
		}else if(id==4){
			model.addAttribute("TypeName",TypeName);
			return "4";
		}
			return "redirect:/";
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
	/**
	 * 页面跳转boardList.html、cuisineList.html、foodList.html、orderList.html、roleList.html
	 * @param model
	 * @return
	 */
	@RequestMapping("boardList")
	public String boardList(Model model) {
		return "boardList";
	}
	
	@RequestMapping("cuisineList")
	public String cuisineList(Model model) {
		return "cuisineList";
	}
	
	@RequestMapping("foodList")
	public String foodList(Model model) {
		return "foodList";
	}
	
	@RequestMapping("orderList")
	public String orderList(Model model) {
		return "orderList";
	}
	
	@RequestMapping("roleList")
	public String roleList(Model model) {
		 List<Login> list=service.list();
		 model.addAttribute("list",list);
		return "roleList";
	}
	/**
	 * 添加管理
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value="admin", method = RequestMethod.GET)
	public String add(Model model) {
		return "admin";
	}
	
	@RequestMapping(value="admin", method = RequestMethod.POST)
	public String add(Login login,Model model) {
		service.add(login);
		return "redirect:roleList";
	}
}
