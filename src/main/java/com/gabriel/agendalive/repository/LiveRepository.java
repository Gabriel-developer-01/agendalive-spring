package com.gabriel.agendalive.repository;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gabriel.agendalive.document.LiveDocument;

public interface LiveRepository extends MongoRepository<LiveDocument, String> {

	 Page<LiveDocument> findByLiveDateAfter(LocalDateTime date, Pageable pageable);
	 Page<LiveDocument> findByLiveDateBefore(LocalDateTime date, Pageable pageable);
} 
