package com.eample.online.backend.test;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eample.shopbackend.dao.ProductDao;
import com.eample.shopbackend.dto.Product;

public class ProductTestClass{

private static AnnotationConfigApplicationContext context;
	private static ProductDao productDao;
	private Product cat1;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.eample.shopbackend");
		context.refresh();
		productDao = (ProductDao) context.getBean("productDao");
	}

	/*@Test
	public void testCrudProduct() {

		cat1 = new Product();
		cat1.setName("OppoFileSize");
		cat1.setDescription("This is a sample description for Oppo");
		cat1.setUnitprice(5200);
		cat1.setActive(true);
		cat1.setCategoryId(3);
		cat1.setSupplierId(3);
		assertEquals("Succesfulll", true, productDao.add(cat1));

		/*cat1 = new Product();
		cat1.setName("OppoFileSize");
		cat1.setDescription("This is a sample description for Oppo");
		cat1.setUnitPrice(5200);
		cat1.setActive(true);
		cat1.setCategoryId(3);
		cat1.setSupplierId(3);
		assertEquals("Succesfulll", true, ProductDao.add(cat1));*/

		/*
		 cat1 = productDao.getid(2);
		cat1.setName("SamsungGalaxy s7");
		assertEquals("Something went wrong", true, productDao.update(cat1));
		assertEquals("Successfull", true, productDao.delete(cat1));
		
		assertEquals("Successfull",8,productDao.list().size());
	}*/

	/*@Test
	public void listActiveProducts()
	{
		assertEquals("Successfull",7,productDao.listActiveProducts().size());
		
	}*/
	@Test
	public void listActiveProductsByCategory()
	{
		assertEquals("Successfull",5,productDao.listActiveProductsByCategory(3).size());
		assertEquals("Successfull",2,productDao.listActiveProductsByCategory(1).size());
		
	}
	@Test
	public void getLatestActiveProducts()
	{
		assertEquals("Successfull",3,productDao.getLatestActiveProducts(3).size());
		
	}
}

