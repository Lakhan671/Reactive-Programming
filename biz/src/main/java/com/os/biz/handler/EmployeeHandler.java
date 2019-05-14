package com.os.biz.handler;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import com.os.biz.entity.Employee;
import com.os.biz.service.EmployeeService;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import reactor.core.publisher.Mono;

@Component
public class EmployeeHandler {
private final EmployeeService  employeeService;
private EmployeeHandler(EmployeeService employeeService) {
	this.employeeService=employeeService;
}

public Mono<ServerResponse> findById(ServerRequest request) {
	System.out.println(request.pathVariable("id"));
    return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(employeeService.findById(request.pathVariable("id")), Employee.class);
}

public Mono<ServerResponse>findAll(ServerRequest request){
	return ok().contentType(MediaType.APPLICATION_JSON).body(employeeService.findAll(),Employee.class);
}
public Mono<ServerResponse>saveEmployee(ServerRequest request){
 final Mono<Employee> employee=request.bodyToMono(Employee.class);
	return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(fromPublisher(employee.flatMap(employeeService::save), Employee.class));

}
public Mono<ServerResponse>deleteById(ServerRequest request){
	return ok().contentType(MediaType.APPLICATION_JSON).body(employeeService.deleteById(request.pathVariable("id")),Void.class);
}
}
