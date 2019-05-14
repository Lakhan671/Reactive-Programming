package com.os.biz.service;

import com.os.biz.entity.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {
	    Mono<Employee> findById(String id);
	    Flux<Employee> findAll();
	    Mono<Employee> save(Employee book);
	    Mono<Void> deleteById(String id);
}
