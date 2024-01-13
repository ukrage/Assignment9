package com.uk.mybatisdemo202401;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/movies/{id}")
    public Movie findById(@PathVariable("id") int id) {
        return movieService.findById(id);
    }

    @GetMapping("/movies")
    public List<Movie> findByName(@RequestParam String movieName) {
        return movieService.findByName(movieName);
    }

    @GetMapping("/movies")
    public List<Movie> findByDirector(@RequestParam String director) {
        return movieService.findByDirector(director);
    }
}
