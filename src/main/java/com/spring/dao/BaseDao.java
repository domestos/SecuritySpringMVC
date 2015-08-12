package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

public interface BaseDao<T> {
 
	void insert(T entity) throws SQLException;
	
	void delete(T entity) throws SQLException;
	
	void deleteAll() throws SQLException;

	List<T> findAll() throws SQLException;
	
	T findById(Object id) throws SQLException;

	T update(T entity) throws SQLException;

	List<T> findByProperty(String property, Object value) throws SQLException;

	int count() throws SQLException;
	
}
