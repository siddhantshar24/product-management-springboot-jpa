package net.firstassignment.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.firstassignment.springboot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}