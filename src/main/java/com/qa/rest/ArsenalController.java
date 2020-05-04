package com.qa.rest;

import com.qa.domain.Arsenal;
import com.qa.service.ArsenalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArsenalController {

    private final ArsenalService service;

    @Autowired
    public ArsenalController(ArsenalService service) { this.service = service; }

    @GetMapping("/getAllArsenal")
    public List<Arsenal> getAllArsenal() { return this.service.readArsenal(); }

    @PostMapping("/createArsenal")
    public Arsenal createArsenal(@RequestBody Arsenal arsenal) { return this.service.createArsenal(arsenal); }

}
