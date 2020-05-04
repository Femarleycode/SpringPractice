package com.qa.service;

import com.qa.domain.Arsenal;
import com.qa.exceptions.ArsenalNotFoundException;
import com.qa.repo.ArsenalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArsenalService {

    private final ArsenalRepository repo;

    @Autowired
    public ArsenalService(ArsenalRepository repo) { this.repo = repo; }

    public List<Arsenal> readArsenal() { return this.repo.findAll(); }

    public Arsenal createArsenal(Arsenal arsenal) { return this.repo.save(arsenal); }

    public Arsenal findArsenalById (Long id) {return this.repo.findById(id).orElseThrow(ArsenalNotFoundException::new); }

    public Arsenal updateArsenal(Long id, Arsenal arsenal){
        Arsenal update = findArsenalById(id);
        update.setpName(arsenal.getpName());
        update.setpPosition(arsenal.getpPosition());
        return this.repo.save(update);
    }

    public boolean deleteNote(Long id){
        if(!this.repo.existsById(id)){
            throw new ArsenalNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}
