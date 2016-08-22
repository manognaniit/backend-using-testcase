package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {




		public static void main(String[] args) {
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	 context.scan("com.niit");
	 context.refresh();
	 CategoryDAO CategoryDAO =(CategoryDAO) context.getBean("categoryDAO");
	 Category Category =(Category) context.getBean("category");

	Category.setId("CAT_001");
	Category.setName("MOBILE");
	Category.setDescription("NEW MOBILES");

	if(CategoryDAO.save(Category)==true){
		System.out.println("successful");
	}
	else{
		System.out.println("not successful");
	}
		}

	


}
