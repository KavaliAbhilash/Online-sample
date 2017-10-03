package com.eample.online.backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eample.shopbackend.dao.CategoryDao;
import com.eample.shopbackend.dto.Category;

public class CategoryTestClass {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categoryDao;
	private Category cat1;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.eample.shopbackend");
		context.refresh();
		categoryDao = (CategoryDao) context.getBean("categoryDao");
	}

	/*
	 * @Test public void testAddCategory(){
	 * 
	 * cat1=new Category(); cat1.setName("Abhilash");
	 * cat1.setDescription("sample"); cat1.setUrl("category.img");
	 * 
	 * assertEquals("Succesfulll",true,categoryDao.add(cat1)); }
	 */

	/*
	 * @Test public void testGetcategory(){
	 * 
	 * cat1= categoryDao.getid(2);
	 * 
	 * assertEquals("Successfull","Abhilash",cat1.getName());
	 * 
	 * }
	 */
	/*
	 * @Test public void testUpdatecategory() {
	 * 
	 * cat1 = categoryDao.getid(2); cat1.setName("TV");
	 * 
	 * assertEquals("Successfull",true, categoryDao.update(cat1)); }
	 */
	/*@Test
	public void testDeletecategory() {

		cat1 = categoryDao.getid(1);
		assertEquals("Successfull",true,categoryDao.delete(cat1));
	}*/
	@Test
	public void testListcategory() {

				assertEquals("Successfull",1,categoryDao.list().size());
	}
	
}
