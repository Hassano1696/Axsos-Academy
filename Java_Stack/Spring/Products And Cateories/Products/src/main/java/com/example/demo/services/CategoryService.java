package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.category;
import com.example.demo.models.products;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;


@Service
public class CategoryService {
	// adding the book repository as a dependency
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;

	public CategoryService(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}

	// returns all the categories
	public List<category> allCategories() {
		return categoryRepository.findAll();
	}

	// creates a category
	public category createCategory(category b) {
		return categoryRepository.save(b);
	}

	// updates a category
	public category addProductToCategory(long id, long productId) {
		Optional<category> c = categoryRepository.findById(id);
		Optional<products> p = productRepository.findById(productId);
		if (c.isPresent() && p.isPresent()) {
			category category = c.get();
			products product = p.get();
			category.getProducts().add(product);
			return categoryRepository.save(category);
		} else {
			return null;
		}

	}

	// retrieves a category
	public category findCategory(Long id) {
		Optional<category> optionalCategory = categoryRepository.findById(id);
		if (optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
	}

	public List<category> findCategoriesNotInProduct(products product) {
		return categoryRepository.findByProductsNotContains(product);
	}

}
