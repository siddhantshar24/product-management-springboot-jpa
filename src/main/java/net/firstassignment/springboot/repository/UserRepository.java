package net.firstassignment.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.firstassignment.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}