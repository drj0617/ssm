package com.dang.ssm.service;

import java.util.List;

import com.dang.ssm.pojo.Items;
import com.github.pagehelper.PageInfo;

public interface ItemsService  {

	List<Items> findAll();

	Items finById(int id);
	
	PageInfo<Items> findList(int currentPage, int pageSize);
	
}
