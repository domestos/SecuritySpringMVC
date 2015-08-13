package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BaseDao;
import com.spring.dao.CompanyDao;
import com.spring.domain.Company;
import com.spring.service.CompanyService;
@Service
public class ComapanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService{
	@Autowired
	private CompanyDao dao;
	@Override
	public BaseDao<Company> getMainDao() {
		
		return dao;
	}

}
