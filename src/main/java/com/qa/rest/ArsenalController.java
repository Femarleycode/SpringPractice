package com.qa.rest;

import com.qa.domain.Arsenal;
import com.qa.service.ArsenalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

    @DeleteMapping("/deleteArsenal/{id}")
    public boolean deleteArsenal(@PathVariable Long id) { return this.service.deleteArsenal(id); }

    @GetMapping("/getArsenal/{id}")
    public Arsenal getArsenalById(@PathVariable Long id) { return this.service.findArsenalById(id); }

    @PutMapping("/updateArsenal/{id}")
    public Arsenal updateArsenal(@PathVariable Long id, @RequestBody Arsenal arsenal){
        return this.service.updateArsenal(id, arsenal);
    }

    @PutMapping("/updateArsenal")
    public Arsenal updateArsenal2(@PathParam("id") Long id, @RequestBody Arsenal arsenal){
        return this.service.updateArsenal(id, arsenal);
    }

}
