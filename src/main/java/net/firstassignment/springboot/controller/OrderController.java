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

import net.firstassignment.springboot.entity.Order;
import net.firstassignment.springboot.exception.ResourceNotFoundException;
import net.firstassignment.springboot.repository.OrderRepository;


@RestController
@RequestMapping("/api/orders")

public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	//get all users
	@GetMapping
	public List<Order> getAllUsers()
	{
		return this.orderRepository.findAll();
	}
	
	
	//get user by id
	@GetMapping("/{id}")
	public Order getUserById(@PathVariable (value="id")long orderId) 
	{
		return this.orderRepository.findById(orderId).orElseThrow(()->new ResourceNotFoundException("Not Found"));
	}
	
	//create user
	@PostMapping
	public Order createUser(@RequestBody Order user)
	{
		return this.orderRepository.save(user);
	}
	
	//update user
	@PutMapping("/{id}")
	public Order updateUser(@RequestBody Order user,@PathVariable ("id") long userId)
	{
		Order existing= this.orderRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("Not Found"));
		existing.setOrderName(user.getOrderName());
		existing.setProductId(user.getProductId());
		existing.setAmount(user.getAmount());
		existing.setUserId(user.getUserId());
		return this.orderRepository.save(existing);
		
	}
	
	//delete user by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Order> deleteUser(@PathVariable ("id") long userId)
	{
		Order existing= this.orderRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("Not Found"));
		this.orderRepository.delete(existing);
		return ResponseEntity.ok().build();
	}
}
