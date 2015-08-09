package com.spring.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.DBDao;



public abstract class DBDaoImpl<T> implements DBDao<T> {
	

	@PersistenceContext(unitName = "primary")
	protected EntityManager em;
		
	public void insert(T c) throws SQLException{
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	public void delete(T c) throws SQLException{
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}
	
	public T findId(int id){
		return em.find(getEntityClass(), id);		
	}
	

	@Transactional
	public List<T> getAll() {
		return em.createQuery("from " + getEntityClass().getSimpleName())
				.getResultList();
	}
		
	@SuppressWarnings("unchecked")
	protected final Class<T> getEntityClass() {
		final Type type = getClass().getGenericSuperclass() instanceof ParameterizedType ? getClass().getGenericSuperclass()
				: getClass().getSuperclass().getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			final ParameterizedType paramType = (ParameterizedType) type;
			return (Class<T>) paramType.getActualTypeArguments()[0];
		} else
			throw new IllegalArgumentException("Could not guess entity class by reflection");
	}
	
}
