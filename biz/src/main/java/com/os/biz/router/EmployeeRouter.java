package com.os.biz.router;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.os.biz.handler.EmployeeHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
@Configuration
public class EmployeeRouter {
	
	@Bean
    public RouterFunction<ServerResponse> route(EmployeeHandler handler) {
        return RouterFunctions
                .route(GET("/employee").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/employee/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/employee").and(accept(MediaType.APPLICATION_JSON)), handler::saveEmployee)
                .andRoute(DELETE("/employee/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::deleteById);
    }
}
