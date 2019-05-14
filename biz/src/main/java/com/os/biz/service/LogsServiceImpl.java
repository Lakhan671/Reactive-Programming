package com.os.biz.service;

import org.springframework.stereotype.Service;

import com.os.biz.entity.Logs;
import com.os.biz.repo.LogsRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LogsServiceImpl implements LogsService {
	LogsRepository logsRepository;

	private LogsServiceImpl(LogsRepository logsRepository) {
		this.logsRepository = logsRepository;
	}

	@Override
	public Mono<Logs> findById(String id) {
		return logsRepository.findById(id);
		
	}

	@Override
	public Flux<Logs> findAll() {
	return	logsRepository.findAll();
	}

	@Override
	public Mono<Logs> save(Logs emp) {
	 return	logsRepository.save(emp);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		 return logsRepository.deleteById(id);
	}

}
