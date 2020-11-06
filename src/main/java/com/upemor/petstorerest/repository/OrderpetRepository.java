package com.upemor.petstorerest.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.upemor.petstorerest.model.OrderPet;

@Repository
public interface OrderPetRepository extends JpaRepository<OrderPet, Integer> {
	
	OrderPet findById(int id);
	
	
	OrderPet findByCreated(Date created);


}
