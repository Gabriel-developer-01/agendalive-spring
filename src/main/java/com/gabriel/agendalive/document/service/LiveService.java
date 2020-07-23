package com.gabriel.agendalive.document.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.agendalive.document.LiveDocument;
import com.gabriel.agendalive.repository.LiveRepository;

@Service
public class LiveService {

    @Autowired
    LiveRepository liveRepository;

    public List<LiveDocument> findAll(){
        return liveRepository.findAll();
    }

    public Optional<LiveDocument> findById(String id){
        return liveRepository.findById(id);
    }

    public LiveDocument save(LiveDocument liveDocument){
        return liveRepository.save(liveDocument);
    }

    public void delete(LiveDocument liveDocument){
        liveRepository.delete(liveDocument);
    }
}