package com.qa.rest;

import com.qa.domain.PremierLeague;
import com.qa.service.PremierLeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class PremierLeagueController {

    private final PremierLeagueService service;

    @Autowired
    public PremierLeagueController(PremierLeagueService service) { this.service = service; }

    @GetMapping("/getAllPl")
    public List<PremierLeague> getAllArsenal() { return this.service.readPremierLeague(); }

    @PostMapping("/createPl")
    public PremierLeague createArsenal(@RequestBody PremierLeague arsenal) { return this.service.createPremierLeague(arsenal); }

    @DeleteMapping("/deletePl/{id}")
    public boolean deleteArsenal(@PathVariable Long id) { return this.service.deletePremierLeague(id); }

    @GetMapping("/getPl/{id}")
    public PremierLeague getPremierLeagueById(@PathVariable Long id) { return this.service.findPremierLeagueById(id); }

    @PutMapping("/updatePl/{id}")
    public PremierLeague updateArsenal(@PathVariable Long id, @RequestBody PremierLeague arsenal){
        return this.service.updatePremierLeague(id, arsenal);
    }

    @PutMapping("/updatePremierLeague2")
    public PremierLeague updateArsenal2(@PathParam("id") Long id, @RequestBody PremierLeague arsenal){
        return this.service.updatePremierLeague(id, arsenal);
    }
}
