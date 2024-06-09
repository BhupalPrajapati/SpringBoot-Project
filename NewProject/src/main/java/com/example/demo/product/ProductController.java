package com.example.demo.product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Products")

public class ProductController {
	
	ProductService ProductService;
	
	@GetMapping()
	public List<Product> getAll(){
		System.out.println("In getAll");
		return ProductService.getAllProducts();
	}

}
