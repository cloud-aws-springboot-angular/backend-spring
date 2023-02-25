package com.sachadev.springangular;

import com.sachadev.springangular.user.UserEntity;
import com.sachadev.springangular.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel")
                    .forEach(name -> {
                        UserEntity user = new UserEntity(name, name.toLowerCase() + "@gmail.com");
                        userRepository.save(user);
                    });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
