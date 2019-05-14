package com.os.biz.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.os.biz.entity.Logs;
public interface LogsRepository extends ReactiveMongoRepository<Logs, String> {

}
