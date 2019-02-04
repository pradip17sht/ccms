package com.ccms.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;

/**
 * This interface is supposed to be implemented by all end-Service interfaces.
 * This interface provides support for all the basic operations for all
 * entities.
 * 
 * @author Sanjay
 *
 * @param <T>
 *            The entity class.
 * @param <ID>
 *            The type of id.
 * 
 * @since April 5, 2017
 * 
 */
public interface GenericService<T, ID extends Serializable> {

	/**
	 * Returns the list of all entity.
	 * 
	 * @return
	 */
	List<T> findAll();
	
	List<T> findAll(Sort sort);

	/**
	 * Returns the entity with given id.
	 * 
	 * @param id
	 *            The id of an entity which is to be fetched.
	 * @return Returns the entity with the corresponding id.
	 */
	T findOne(ID id);

	/**
	 * Either saves or updates the provided entity. If the entity is present in
	 * datasource with the same id of the provided entity, then it updates the
	 * entity present in datasource; if there's no such entity, it creates the
	 * new one in the datasource.
	 * 
	 * @param entity
	 *            The entity to be saved or updated.
	 * @return The saved or updated entity.
	 */
	T saveOrUpdate(T entity);

	/**
	 * Either saves or updates the provided entities. If particular entity is
	 * present in datasource with the same id of the provided entity, then it
	 * updates the entity present in datasource; if there's no such entity, it
	 * creates the new one in the datasource.
	 * 
	 * @param entities
	 *            The entities to be saved or updated.
	 * @return The saved or updated entities.
	 */
	List<T> saveOrUpdate(Iterable<T> entities);

	/**
	 * Removes the entity from datasource with the provided id.
	 * 
	 * @param id
	 *            The id of the entity to be removed.
	 */
	void delete(ID id);

	/**
	 * Removes the entity from datasource.
	 * 
	 * @param entity
	 *            The entity to be removed.
	 */
	void delete(T entity);
}
