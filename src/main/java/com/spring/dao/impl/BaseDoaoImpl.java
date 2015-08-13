package com.spring.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.BaseDao;

public abstract class BaseDoaoImpl<T> implements BaseDao<T> {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;	
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	protected final Class<T> getEntityClass() {
		final Type type = getClass().getGenericSuperclass() instanceof ParameterizedType
				? getClass().getGenericSuperclass() : getClass().getSuperclass().getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			final ParameterizedType paramType = (ParameterizedType) type;
			return (Class<T>) paramType.getActualTypeArguments()[0];
		} else
			throw new IllegalArgumentException("Could not guess entity class by reflection");
	}

	@Transactional
	public void insert(T entit) throws SQLException {
		em.persist(entit);
	}
	
	@Transactional
	public void delete(T entit) throws SQLException {
		em.remove(entit);

	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return em.createQuery("From " + getEntityClass().getSimpleName())
				.getResultList();
	}

	@Transactional
	public void deleteAll() throws SQLException {
		em.createQuery("FROM " + getEntityClass().getSimpleName()).getResultList();

	}

	public T findById(Object id) throws SQLException {
		return em.find(getEntityClass(), id);

	}

	@Transactional
	public T update(T entity) throws SQLException {
		return em.merge(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String property, Object value) throws SQLException {
		return em.createQuery("FROM " + getEntityClass().getSimpleName() + " WHERE property = '" + value + "'")
				.getResultList();
	}

	public int count() throws SQLException {
		return ((Number) em.createQuery("SELECT COUNT(c) FROM " + getEntityClass().getSimpleName() + " c")
				.getSingleResult()).intValue();
	}

}
