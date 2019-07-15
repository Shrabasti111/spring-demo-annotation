package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

    @Bean
    public Actor actorBean() {
        Actor actor = new Actor();
        actor.setName("Matt Bomer");
        actor.setGender("Male");
        actor.setAge(40);
        return actor;
    }

    @Bean
    public Movie movieBean() {
        Movie  movie = new Movie();
        movie.setActor(actorBean());
        return movie;
    }
}