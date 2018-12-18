package com.rcd.webcasino.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ObjectCreationTest {
	
	public static void main(String args[]) {
		
		PayMethod[] paymethods = new PayMethod[2];
		
		PayMethod pm1 = new PayMethod();
		pm1.setNumcard("1234123412341234");
		pm1.setCvv("232");
		pm1.setExpirationdate(new Date());
		pm1.setExpirated(false);
		pm1.setOwnername("Rafael");
		pm1.setOwnersurname("Cervelo");
		
		System.out.println(pm1);
		
		User[] users = new User[2];
		
		User u1 = new User();
		
		u1.setName("Rafa");
		u1.setSurname1("Cervelo");
		u1.setSurname2("Deus");
		u1.setPassword("rafacervelo");
		u1.setUserid("1");
		u1.setUsername("raficd");
		
		System.out.println(u1);
		
		Cart[] cart = new Cart[2];
		
		Cart c1 = new Cart();
		
		c1.setProduct("Product 1");
		c1.setProductamo(3);
		c1.setTotalprice(25.90);
		c1.setDate(new Date());
		
		System.out.println(c1);
	
	
		for (Cart c2: cart) {
			
			System.out.println("Cart: "+ToStringBuilder.reflectionToString(cart));
		}
	}
}