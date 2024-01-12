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

    @PostMapping("/nameList")
    public List<Movie> findByNames(@RequestParam String movieName) {
        return movieMapper.findByNameContains(movieName);
    }

    @PostMapping("/directorList")
    public List<Movie> findByDirector(@RequestParam String director) {
        return movieMapper.findByDirectorContains(director);
    }
}
