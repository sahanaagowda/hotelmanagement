package com.ty.hotelmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hotelmanagement.dto.FoodOrder;

public class FoodOrderDao {
	public FoodOrder saveMenu(FoodOrder foodOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}

}
