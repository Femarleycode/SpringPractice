package com.qa.service;

import com.qa.domain.PremierLeague;
import com.qa.exceptions.PremierLeagueNotFoundException;
import com.qa.repo.PremierLeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremierLeagueService {

    private final PremierLeagueRepository repo;

    @Autowired
    public PremierLeagueService(PremierLeagueRepository repo){ this.repo = repo; }

    public List<PremierLeague> readPremierLeague() { return this.repo.findAll(); }

    public PremierLeague createPremierLeague(PremierLeague premierLeague) { return this.repo.save(premierLeague); }

    public PremierLeague findPremierLeagueById (Long id){
        return this.repo.findById(id).orElseThrow(PremierLeagueNotFoundException::new);
    }

    public PremierLeague updatePremierLeague(Long id, PremierLeague premierLeague){
        PremierLeague update = findPremierLeagueById(id);
        update.setName(premierLeague.getName());
        return this.repo.save(update);
    }

    public boolean deletePremierLeague(Long id){
        if(!this.repo.existsById(id)){
            throw new PremierLeagueNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);


    }
}
