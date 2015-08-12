package com.spring.service.impl;

import org.springframework.stereotype.Service;

import com.spring.dao.BaseDao;
import com.spring.dao.CompanyDao;
import com.spring.domain.Company;
import com.spring.service.CompanyService;
@Service
public class ComapanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService{

	private CompanyDao dao;
	@Override
	public BaseDao<Company> getMainDao() {
		
		return dao;
	}

}
