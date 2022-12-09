package net.firstassignment.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.firstassignment.springboot.entity.Product;
import net.firstassignment.springboot.exception.ResourceNotFoundException;
import net.firstassignment.springboot.repository.ProductRepository;




@RestController
@RequestMapping("/api/products")

public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	//get all users
	@GetMapping
	public List<Product> getAllUsers()
	{
		return this.productRepository.findAll();
	}
	
	
	//get user by id
	@GetMapping("/{id}")
	public Product getUserById(@PathVariable (value="id")long productId) 
	{   
		return this.productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("Not Found"));
	}
	
	//create user
	@PostMapping
	public Product createUser(@RequestBody Product product)
	{
		return this.productRepository.save(product);
	}
	
	//update user
	@PutMapping("/{id}")
	public Product updateUser(@RequestBody Product product,@PathVariable ("id") long productId)
	{
		Product existing= this.productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("Not Found"));
		existing.setPrice(product.getPrice());
		existing.setQuantity(product.getQuantity());
		existing.setName(product.getName());
		return this.productRepository.save(existing);
		
	}
	
	//delete user by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Product> deleteUser(@PathVariable ("id") long productId)
	{
		Product existing= this.productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("Not Found"));
		this.productRepository.delete(existing);
		return ResponseEntity.ok().build();
	}
}
