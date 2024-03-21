package com.ecumayferrr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

import com.ecumayferrr.model.Empleado;
import com.ecumayferrr.repository.EmpleadoRepositorio;

/*
DB --> JDBC --> Hibernate --> Spring Data JPA
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        var employeeRepo = context.getBean(EmpleadoRepositorio.class);

        List<Empleado> employees = List.of(
                new Empleado(null, "employee1", LocalDate.now(), true),
                new Empleado(null, "employee2", LocalDate.now(), false),
                new Empleado(null, "employee3", LocalDate.now(), true),
                new Empleado(null, "employee4", LocalDate.now(), false),
                new Empleado(null, "employee5", LocalDate.now(), true)
        );
        employeeRepo.saveAll(employees);


        employeeRepo.findAllByMarriedTrue().forEach(System.out::println);

    }

}
