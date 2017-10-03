package com.eample.shopbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eample.shopbackend.dao.ProductDao;
import com.eample.shopbackend.dto.Product;

@Repository("productDao")
@Transactional
//@Transactional(propagation = Propagation.REQUIRES_NEW)
public class Productdaoimpl implements ProductDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		
		String selectProducts = "FROM Product" ;
		
		Query query = sessionfactory.getCurrentSession().createQuery(selectProducts);
		
		return query.getResultList();
	}

	@Override
	public Product getid(int id) {
		// TODO Auto-generated method stub
		try{
		return sessionfactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		}

	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		try{
			
			sessionfactory.getCurrentSession().persist(product);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		try{
			
			sessionfactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		product.setActive(false);
		
		
		try{
			product.setActive(false);
			return this.update(product);
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Product> listActiveProducts() {
		// TODO Auto-generated method stub
		String selectActiveProducts = "FROM Product where active = :active" ;
		Query query = sessionfactory.getCurrentSession().createQuery(selectActiveProducts);
		query.setParameter("active",true);
		
		return query.getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		String selectActiveProductsByCategory = "FROM Product where active = :active AND categoryId = :categoryId" ;
		
		Query query = sessionfactory.getCurrentSession().createQuery(selectActiveProductsByCategory);
		
		query.setParameter("active",true);
		query.setParameter("categoryId",categoryId);
		
		return query.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		// TODO Auto-generated method stub
		String selectActiveProductsByCategory = "FROM Product where active = :active ORDER BY id" ;
		
		Query query = sessionfactory.getCurrentSession().createQuery(selectActiveProductsByCategory);
		
		query.setParameter("active",true);
		query.setFirstResult(0);
		query.setMaxResults(count);
		
		return query.getResultList();
	}

}
