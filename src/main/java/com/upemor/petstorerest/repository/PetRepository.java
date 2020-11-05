package com.upemor.petstorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upemor.petstorerest.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

}
