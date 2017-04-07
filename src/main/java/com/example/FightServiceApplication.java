package com.example;

import lombok.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
public class FightServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FightServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner (FightRepository fightRepository){
		return (args) -> {
			fightRepository.save(Fight.builder().result("WIN").combination(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER))).build());
			fightRepository.save(Fight.builder().result("WIN").combination(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER))).build());
			fightRepository.save(Fight.builder().result("DEFEAT").combination(new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER))).build());

			fightRepository.findByResult("WIN").forEach(System.out::println);
	};
	}
}






