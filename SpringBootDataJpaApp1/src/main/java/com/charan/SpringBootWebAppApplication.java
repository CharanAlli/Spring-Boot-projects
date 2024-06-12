package com.charan;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.charan.entity.Player;
import com.charan.repository.PlayerRepository;

@SpringBootApplication
public class SpringBootWebAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringBootWebAppApplication.class, args);
	PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
	/*Player p=new Player();
	p.setPlayerId(103);
	p.setPlayerName("vijay");
	p.setPlayerAge(36);
	p.setLocation("kurnool");
	playerRepository.save(p);
	System.out.println("Record is inserted Success");*/
	/*Player p1=new Player(104, "Basith", 26, "karachi");
	Player p2=new Player(105, "Ramboo", 25, "Karnataka");
	Player p3=new Player(106, "Jackie", 32, "Ranchi");
	playerRepository.saveAll(Arrays.asList(p1,p2,p3));
	Player p4=new Player();
	p4.setPlayerId(107);
	p4.setPlayerName("abdul");
	p4.setPlayerAge(23);
	p4.setLocation("India(Old city)");
	playerRepository.save(p4);
	System.out.println("abdul is from USA");
	System.out.println("Total number of records are :"+playerRepository.count());
	playerRepository.deleteById(106);
	System.out.println("record with id 106 is present :"+playerRepository.existsById(106));*/
	}

}
