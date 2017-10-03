package com.eample.shopbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eample.shopbackend.dao.CategoryDao;
import com.eample.shopbackend.dto.Category;

@Repository("categoryDao")
@Transactional
public class Categorydaoimpl implements CategoryDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	public List<Category> list(){
		// TODO Auto-generated method stub
		
		String selectActiveCategory = " FROM Category WHERE active = :active";
		
		Query query = sessionfactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active",true);
		
		
		return query.getResultList();
	}

	@Override
	public Category getid(int id) {
		// TODO Auto-generated method stub
	
		return sessionfactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try{
		
			sessionfactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try{
			
			sessionfactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub

		category.setActive(false);
		
		
		try{
			sessionfactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}

	}

}
