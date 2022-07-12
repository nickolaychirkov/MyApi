package com.example.myapi.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Dasha", "dary@gmail.com", LocalDate.of(1994, Month.JULY, 21)),
                    new Student("Kolya", "nick@mail.ru", LocalDate.of(1993, Month.JUNE, 6))
            ));
        };
    }
}
