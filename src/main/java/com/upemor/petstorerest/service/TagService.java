package com.upemor.petstorerest.service;

import java.util.List;

import com.upemor.petstorerest.model.Tag;

public interface TagService {

	
	//Operaciones CRUD en base de datos 
	
	List<Tag>listAllTags();
	
	Tag findById(int id);
	
	boolean createTag(Tag tag);
	
	Tag updateTag(int id, Tag tag);
	
	void deleteTag(int id);
	
}
