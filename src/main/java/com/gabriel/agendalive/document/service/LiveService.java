package com.gabriel.agendalive.document.service;

import java.time.LocalDate;
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

	public Page<LiveDocument> findAll(Pageable pageable, String date) {
		if (date != null) {
			return liveRepository.findByLiveDate(LocalDate.parse(date), pageable);
		} else {
			//return liveRepository.findAll(pageable);
			return liveRepository.findByLiveDateGreaterThan(LocalDate.now().minusDays(1), pageable);
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