package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.category;
import com.example.demo.models.products;
import com.example.demo.services.CategoryService;
import com.example.demo.services.ProductService;


@Controller
public class ProdController {
	private final CategoryService categoryService;
	private final ProductService productService;

	public ProdController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}

	// Categories routes



	@GetMapping("/categories/new")
	public String index(@ModelAttribute("category") category category) {
		return "Cnew.jsp";
	}

	@PostMapping("/categories")
	public String create(@Valid @ModelAttribute("category") category category, BindingResult result) {
		if (result.hasErrors()) {
			return "Cnew.jsp";
		} else {
			categoryService.createCategory(category);
			return "redirect:/categories";
		}
	}

	@GetMapping("/categories/{id}")
	public String index(@PathVariable("id") Long id, Model model) {
		category category = categoryService.findCategory(id);
		List<products> products = productService.findProductsNotInCategory(category);
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		return "Cdetails.jsp";
	}

	@PutMapping("/categories/{id}")
	public String addProduct(@PathVariable("id") Long id, @RequestParam(value = "id") Long productId) {
		categoryService.addProductToCategory(id, productId);
		return String.format("redirect:/categories/%d", id);

	}

	@GetMapping("/products/new")
	public String newNinja(@ModelAttribute("product") products product) {

		return "Pnew.jsp";
	}

	@PostMapping("/products")
	public String create(@Valid @ModelAttribute("product") products product, BindingResult result) {
		if (result.hasErrors()) {
			return "Pnew.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/products";
		}
	}

	@GetMapping("/products/{id}")
	public String productDetails(@PathVariable("id") Long id, Model model) {
		products product = productService.findProduct(id);
		List<category> categories = categoryService.findCategoriesNotInProduct(product);
		model.addAttribute("categories", categories);
		model.addAttribute("product", product);
		return "Pdetails.jsp";
	}

	@PutMapping("/products/{id}")
	public String addCategory(@PathVariable("id") Long id, @RequestParam(value = "id") Long categoryId) {
		productService.addCategoryToProduct(id, categoryId);
		return String.format("redirect:/products/%d", id);

	}
}
