package com.ait.clint;

import com.ait.dao.ProductDAO;
import com.ait.dao.impl.ProductDAOImpl;
import com.ait.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOImpl();

		ProductEntity pEntity = new ProductEntity();
		pEntity.setProductid(101);
		pEntity.setProductName("Amit");
		pEntity.setQuantity(12);
		pEntity.setUnitPrice(10000.0);

		ProductEntity save = dao.saveProduct(pEntity);
		System.out.println(save);
	}

}
