package com.gabriel.agendalive.document.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gabriel.agendalive.document.LiveDocument;
import com.gabriel.agendalive.repository.LiveRepository;

@Service
public class LiveService {

	@Autowired
	LiveRepository liveRepository;

	public Page<LiveDocument> findAll(Pageable pageable, String flag) {
		if (flag != null && flag.equals("next")) {
			return liveRepository.findByLiveDateAfter(LocalDateTime.now(), pageable);
		} else if (flag != null && flag.equals("previous")) {
			return liveRepository.findByLiveDateBefore(LocalDateTime.now(), pageable);
		} else {
			return liveRepository.findAll(pageable);
		}
	}

	public Optional<LiveDocument> findById(String id) {
		return liveRepository.findById(id);
	}

	public LiveDocument save(LiveDocument liveDocument) {
		return liveRepository.save(liveDocument);
	}

	public void delete(LiveDocument liveDocument) {
		liveRepository.delete(liveDocument);
	}
}