package com.eample.shopbackend.dao;

import java.util.List;

import com.eample.shopbackend.dto.Product;

public interface ProductDao{

	
	List<Product> list();
	Product getid(int id);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
}
