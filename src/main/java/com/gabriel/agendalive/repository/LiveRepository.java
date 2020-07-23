package com.gabriel.agendalive.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gabriel.agendalive.document.LiveDocument;

public interface LiveRepository extends MongoRepository<LiveDocument, String> {
	
}