package com.dang.ssm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dang.ssm.mapper.ItemsMapper;
import com.dang.ssm.pojo.Items;
import com.dang.ssm.pojo.ItemsExample;
import com.dang.ssm.service.ItemsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ItemsServiceImp implements ItemsService{

	@Autowired
	private ItemsMapper itemsMapper;
	
	public List<Items> findAll() {

		ItemsExample example = new ItemsExample();
		return itemsMapper.selectByExample(example);
		
	}

	public Items finById(int id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

	public PageInfo<Items> findList(int currentPage, int pageSize) {

		PageHelper.startPage(currentPage, pageSize);
		
		ItemsExample example = new ItemsExample();
		List<Items> list = itemsMapper.selectByExample(example);
		
		PageInfo<Items> info = new PageInfo<Items>(list);
		
		return info;
	}

}
