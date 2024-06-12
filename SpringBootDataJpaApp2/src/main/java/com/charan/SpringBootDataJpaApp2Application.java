package com.charan;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.charan.entity.Users;
import com.charan.repository.UsersRepository;

@SpringBootApplication
public class SpringBootDataJpaApp2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringBootDataJpaApp2Application.class, args);
	UsersRepository ur=context.getBean(UsersRepository.class);
	Optional<Users> rec=ur.findById(103);
	if (rec.isPresent()){
		System.out.println(rec.get());
	}
	else {
		System.out.println("Invalid Id");
	}
	}

}
