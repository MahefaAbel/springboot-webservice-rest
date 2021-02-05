package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {	
	private static final String template = "Produit #%s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public String index() {
		return "Bienvienu sur springboot";
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(
			@RequestParam(value = "id", defaultValue = "3") String id
	) {
		return new Product(counter.incrementAndGet(), String.format(template, id));
	}

}