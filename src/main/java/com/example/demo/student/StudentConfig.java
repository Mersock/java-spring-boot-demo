package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student test = new Student(
                    "test",
                    "test@email",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student alex = new Student(
                    "alex",
                    "alex@mail.com",
                    LocalDate.of(2003, Month.JANUARY, 14)
            );

            repository.saveAll(
                    List.of(test, alex)
            );
        };
    }
}
