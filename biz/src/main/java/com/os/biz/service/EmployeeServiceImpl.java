package com.os.biz.service;

import org.springframework.stereotype.Service;

import com.os.biz.entity.Employee;
import com.os.biz.repo.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository;

	private EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Mono<Employee> findById(String id) {
		return employeeRepository.findById(id);
		
	}

	@Override
	public Flux<Employee> findAll() {
	return	employeeRepository.findAll();
	}

	@Override
	public Mono<Employee> save(Employee emp) {
	 return	employeeRepository.save(emp);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		 return employeeRepository.deleteById(id);
	}

}
