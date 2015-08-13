package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BaseDao;
import com.spring.dao.CartridgeDao;
import com.spring.domain.Cartridge;
import com.spring.service.CartridgeService;
@Service
public class CartridgeServiceImpl extends BaseServiceImpl<Cartridge> implements CartridgeService{
    @Autowired
	private CartridgeDao dao;
	
	@Override
	public BaseDao<Cartridge> getMainDao() {
		
		return dao;
	}

}
