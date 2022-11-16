package com.ty.hotelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotelmanagement.dto.Menu;

public class MenuDao {
	public Menu saveMenu(Menu menu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();

		return menu;
	}

	public Menu updateMenu(Menu menu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(menu);
		entityTransaction.commit();

		return menu;
	}
//	public void updateMenu(int id) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Menu menu=entityManager.find(Menu.class, 1);
//		entityTransaction.begin();
//		entityManager.merge(menu);
//		entityTransaction.commit();
//
//}


	public boolean deleteMenu(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Menu menu = entityManager.find(Menu.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(menu);
		entityTransaction.commit();

		return true;
	}
	
	public Menu getMenuById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Menu.class, id);
	}

}
