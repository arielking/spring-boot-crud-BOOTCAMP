package com.unilever.developer;

import com.unilever.developer.domain.Machine;
import com.unilever.developer.domain.User;
import com.unilever.developer.repository.MachineRepository;
import com.unilever.developer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DeveloperApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;



	public static void main(String[] args) {
		SpringApplication.run(DeveloperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one", "one"));
		userRepository.save(new User("two", "one"));
		userRepository.save(new User("three", "one"));

	}

}
