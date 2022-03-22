package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.category;
import com.example.demo.models.products;

//...
//...
@Repository
public interface ProductRepository extends CrudRepository<products, Long> {
	// this method retrieves all the books from the database
	List<products> findAll();

	List<products> findByCategoriesNotContains(category category);
	// this method finds books with descriptions containing the search string
//	List<Language> findByDescriptionContaining(String search);

}