package com.spring.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.spring.dao.CompanyDao;
import com.spring.domain.Company;


@Repository
public class CompanyDaoImpl  extends BaseDoaoImpl<Company> implements CompanyDao {

}
