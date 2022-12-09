package net.firstassignment.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.firstassignment.springboot.repository.OrderRepository;
import net.firstassignment.springboot.repository.ProductRepository;
import net.firstassignment.springboot.repository.UserRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class SpringbootAssignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssignment1Application.class, args);
	}
	

	
	
}
