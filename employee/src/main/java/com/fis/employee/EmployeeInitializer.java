package com.fis.employee;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class ItemInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    ItemInitializer(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
		Stream.of("bhavana", "ajay", "akil", "janu", "manu", "tanu", "anu")
                .forEach(employee -> employeeRepository.save(new Employee(employee)));
        employeeRepository.findAll().forEach(System.out::println);
    }
}


