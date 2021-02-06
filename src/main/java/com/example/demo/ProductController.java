package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {	
	private static final String template = "Produit #%s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public String index() {
		return "ProductController";
	}
	
	@GetMapping("/{id}")
	public EntityModel<Product> getProduct(
			@RequestParam(value = "id", defaultValue = "3") String id
	) {
		Product produit = new Product(counter.incrementAndGet(), String.format(template, id));
		return EntityModel.of(produit,
		      linkTo(( methodOn(ProductController.class)).one(id)).withSelfRel(),
		      linkTo(( methodOn(ProductController.class)).all()).withRel("employees")
		);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Object methodOn(Class<ProductController> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}