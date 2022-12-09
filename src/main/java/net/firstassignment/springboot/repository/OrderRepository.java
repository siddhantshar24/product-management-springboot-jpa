package net.firstassignment.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.firstassignment.springboot.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}