package com.vishal.persistence.dao;


public interface IDao {

	public void commit();
	public void rollback();
	public void beginTransation();
}
