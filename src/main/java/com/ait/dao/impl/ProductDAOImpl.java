package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.ProductDAO;
import com.ait.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	private EntityManagerFactory factory;
	public ProductDAOImpl(){
	 factory = Persistence.createEntityManagerFactory("AdvServlet");
	}
	@Override
	public ProductEntity saveProduct(ProductEntity product) {

		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();

		try {
			createEntityManager.persist(product);
			transaction.commit();
			System.out.println("data inserted");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("data not inserted");
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity find = entityManager.find(ProductEntity.class, productId);
		entityManager.close();
		return null;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double unitPrice) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class, productId);
		EntityTransaction t = entityManager.getTransaction();
		t.begin();
		p.setUnitPrice(unitPrice);
		t.commit();
		entityManager.close();
		return p;
	}

	@Override
	public void deleteProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.remove(p);
		tx.commit();
		entityManager.close();
	}
}
