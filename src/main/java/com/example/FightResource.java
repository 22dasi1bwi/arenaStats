package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by SDA on 07.04.2017.
 */
@RestController
@RequestMapping("/fight-service")
public class FightResource {

    private final FightRepository fightRepository;

    FightResource(FightRepository fightRepository) {
        this.fightRepository = fightRepository;
    }

    @GetMapping("/results")
    public Collection<Fight> getResults(){
        return fightRepository.findByResult("WIN");
    }

    @PostMapping("/results")
    public Fight createFight(@RequestBody Fight fight){
        return fightRepository.save(fight);
    }
}
