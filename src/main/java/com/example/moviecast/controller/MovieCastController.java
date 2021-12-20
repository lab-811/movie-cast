package com.example.moviecast.controller;

import com.example.moviecast.model.Actor;
import com.example.moviecast.model.ActorsList;
import com.example.moviecast.service.MovieCastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cast")
public class MovieCastController {

    @Autowired
    private MovieCastService service;

    @GetMapping("/{movieId}")
    public ActorsList getActors(@PathVariable("movieId") Long movieId) {
        return  service.getActors(movieId);
    }

}
