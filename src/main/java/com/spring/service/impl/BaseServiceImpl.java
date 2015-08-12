package com.spring.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.dao.BaseDao;
import com.spring.service.BaseService;
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	public abstract BaseDao<T> getMainDao();

	public void insert(T entity) throws SQLException {
		getMainDao().insert(entity);

	}

	public void delete(T entity) throws SQLException {
		getMainDao().delete(entity);

	}

	public void deleteAll() throws SQLException {
		getMainDao().deleteAll();

	}

	public List findAll() throws SQLException {
			System.out.println(getMainDao().findAll());
		return getMainDao().findAll(); 
	}

	public T findById(Object id) throws SQLException {
		return getMainDao().findById(id);
	}

	public T update(T entity) throws SQLException {
		return getMainDao().update(entity);
	}

	public List findByProperty(String property, Object value) throws SQLException {
		return getMainDao().findByProperty(property, value);
	}

	public int count() throws SQLException {
		return getMainDao().count();
	}

}
