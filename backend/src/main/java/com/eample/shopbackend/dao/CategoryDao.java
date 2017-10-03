package com.eample.shopbackend.dao;

import java.util.List;

import com.eample.shopbackend.dto.Category;

public interface CategoryDao {

	
	List<Category> list();
	Category getid(int id);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
