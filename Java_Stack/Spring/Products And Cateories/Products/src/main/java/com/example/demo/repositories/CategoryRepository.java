package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.category;
import com.example.demo.models.products;


//...
//...
@Repository
public interface CategoryRepository extends CrudRepository<category, Long> {
	List<category> findAll();

	List<category> findByProductsNotContains(products product);

}
