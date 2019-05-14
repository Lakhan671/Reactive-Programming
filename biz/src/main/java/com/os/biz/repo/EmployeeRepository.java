package com.os.biz.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.os.biz.entity.Employee;
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

}
