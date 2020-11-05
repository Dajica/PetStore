package com.upemor.petstorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upemor.petstorerest.model.Tag;
import com.upemor.petstorerest.repository.TagRepository;

@Service
public class TagServiceInp implements TagService {
	
	@Autowired
	private TagRepository tagRepository;
	
	public List<Tag> listAllTags(){
		List<Tag> tags = tagRepository.findAll();
		return tags;
		
	}
	
	public Tag findById(int id) {
		Tag tagDTO =tagRepository.findById(id);
		return tagDTO;
	}
	
	public void createTag(Tag tag) {
		tagRepository.save(tag);
	}
	
	public Tag updateTag(int id, Tag tag) {
		Tag current = tagRepository.findById(id);
		current.setName(tag.getName());
		tagRepository.save(current);
		return current;
	}
	
	public void deleteTag(int id) {
		tagRepository.deleteById(id);
	}
	
	



}
