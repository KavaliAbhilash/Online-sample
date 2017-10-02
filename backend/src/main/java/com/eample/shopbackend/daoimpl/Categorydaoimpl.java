package com.eample.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.eample.shopbackend.dao.CategoryDao;
import com.eample.shopbackend.dto.Category;

@Repository("category")
public class Categorydaoimpl implements CategoryDao{

	private static List<Category> categories=new ArrayList<Category>(); 
	
	static {
		Category cat1=new Category();
		
		cat1.setId(1);
		cat1.setName("Abhi");
		cat1.setDescription("sample");
		cat1.setUrl("category.img");
		
	categories.add(cat1);	
		cat1=new Category();
		cat1.setId(2);
		cat1.setName("Abhilash");
		cat1.setDescription("sample");
		cat1.setUrl("category.img");
		
	categories.add(cat1);
	}
	
	public List<Category> list(){
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category getid(int id) {
		// TODO Auto-generated method stub
		for(Category cat2 : categories){
			if(cat2.getId()==id)
				return cat2;
		}
		return null;
	}

}
