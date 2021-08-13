package com.fis.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;


@RepositoryRestResource
interface EmployeeRepository extends JpaRepository<Employee, Long> {}
