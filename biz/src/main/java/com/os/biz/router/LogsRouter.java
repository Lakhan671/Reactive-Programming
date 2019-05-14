package com.os.biz.router;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.os.biz.handler.LogsHandler;
@Configuration
public class LogsRouter {
	
	@Bean
    public RouterFunction<ServerResponse> route(LogsHandler handler) {
        return RouterFunctions
                .route(GET("/employee").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/employee/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/employee").and(accept(MediaType.APPLICATION_JSON)), handler::saveEmployee)
                .andRoute(DELETE("/employee/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::deleteById);
    }
}
