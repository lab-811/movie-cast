package com.example.moviecast.service;

import com.example.moviecast.model.Actor;
import com.example.moviecast.model.ActorsList;
import com.example.moviecast.repository.MovieCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCastService {

    @Autowired
    public MovieCastRepository repository;

    public ActorsList getActors(Long movieId) {
        List<Actor> actors = repository.findAllCast(movieId);
        System.out.println("actors:" + actors);
        ActorsList actorsList = new ActorsList();
        actorsList.setActors(actors);
        return  actorsList;
    }
}
