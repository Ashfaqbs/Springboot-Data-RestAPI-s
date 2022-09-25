package com.data.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.data.demo.entity.Book;

@RepositoryRestResource(path = "mybooks")
public interface BookDao  extends JpaRepository<Book, Integer>{

	
	
}
