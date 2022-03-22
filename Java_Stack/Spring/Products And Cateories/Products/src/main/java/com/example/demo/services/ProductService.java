package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.category;
import com.example.demo.models.products;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;


@Service
public class ProductService {
	// adding the book repository as a dependency

	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;

	public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {

		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}

	// creates a product
	public products createProduct(products item) {
		return productRepository.save(item);
	}

	// finds all products that don't belong to a certain category
	public List<products> findProductsNotInCategory(category category) {
		return productRepository.findByCategoriesNotContains(category);
	}

	public List<products> allProducts() {
		return productRepository.findAll();
	}

	public products findProduct(Long id) {
		Optional<products> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}

	public products addCategoryToProduct(long id, long categoryId) {
		Optional<products> p = productRepository.findById(id);
		Optional<category> c = categoryRepository.findById(categoryId);
		if (p.isPresent() && c.isPresent()) {
			products product = p.get();
			category category = c.get();
			product.getCategories().add(category);
			return productRepository.save(product);
		} else {
			return null;
		}

	}

}
