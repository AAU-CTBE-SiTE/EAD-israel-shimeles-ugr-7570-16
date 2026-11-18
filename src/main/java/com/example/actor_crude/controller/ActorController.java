package com.example.actor_crude.controller;

import com.example.actor_crude.model.Actor;
import com.example.actor_crude.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }

    @DeleteMapping("/{id}")
    public String deleteActor(@PathVariable Long id) {
        actorService.deleteActor(id);
        return "Actor deleted successfully with id: " + id;
    }
}