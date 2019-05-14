package com.os.biz.handler;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.os.biz.entity.Logs;
import com.os.biz.service.LogsService;

import reactor.core.publisher.Mono;

@Component
public class LogsHandler {
private final LogsService  logsService;
private LogsHandler(LogsService logsService) {
	this.logsService=logsService;
}

public Mono<ServerResponse> findById(ServerRequest request) {
	System.out.println(request.pathVariable("id"));
    return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(logsService.findById(request.pathVariable("id")), Logs.class);
}

public Mono<ServerResponse>findAll(ServerRequest request){
	return ok().contentType(MediaType.APPLICATION_JSON).body(logsService.findAll(),Logs.class);
}
public Mono<ServerResponse>saveEmployee(ServerRequest request){
 final Mono<Logs> employee=request.bodyToMono(Logs.class);
	return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(fromPublisher(employee.flatMap(logsService::save), Logs.class));

}
public Mono<ServerResponse>deleteById(ServerRequest request){
	return ok().contentType(MediaType.APPLICATION_JSON).body(logsService.deleteById(request.pathVariable("id")),Void.class);
}
}
