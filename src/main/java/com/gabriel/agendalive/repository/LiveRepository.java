package com.gabriel.agendalive.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gabriel.agendalive.document.LiveDocument;

public interface LiveRepository extends MongoRepository<LiveDocument, String> {

	Page<LiveDocument> findByLiveDate(LocalDate date, Pageable pageable);
	Page<LiveDocument> findByLiveDateGreaterThan(LocalDate date, Pageable pageable);
} 
