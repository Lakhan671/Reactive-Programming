package com.os.biz.service;


import com.os.biz.entity.Logs;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LogsService {
	    Mono<Logs> findById(String id);
	    Flux<Logs> findAll();
	    Mono<Logs> save(Logs book);
	    Mono<Void> deleteById(String id);
}
