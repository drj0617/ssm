package com.dang.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dang.ssm.pojo.Items;
import com.dang.ssm.service.ItemsService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/items/list.action")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		List<Items> list = itemsService.findAll();
		
		mav.addObject("list",list);
		
		mav.setViewName("itemList");
		
		return mav;
	}
	
	/*@RequestMapping("/items/itemEdit.action")
	public ModelAndView itemEdit(int id) {
		ModelAndView mav = new ModelAndView();
		
		Items item = itemsService.finById(id);
		
		mav.addObject("item", item);
		
		mav.setViewName("editItem");
		
		return mav;
	}*/
	
	@RequestMapping("/items/itemEdit.action")
	public String itemEdit(int id,Model model) {
		
		Items item = itemsService.finById(id);
		
		model.addAttribute("item", item);
		
		return "editItem";
	}
	
	
	
	
}
