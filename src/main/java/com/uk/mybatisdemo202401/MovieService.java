package com.uk.mybatisdemo202401;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieMapper movieMapper;

    public MovieService(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    public Movie findById(int id) {
        Optional<Movie> movie = movieMapper.findById(id);
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new MovieNotFoundException("Movie not found");
        }
    }

    public List<Movie> findByName(String movieName) {
        List<Movie> movies = movieMapper.findByNameContains(movieName);
        if (!movies.isEmpty()) {
            return movies;
        } else {
            throw new MovieNotFoundException("Movie not found by movieName");
        }
    }

    public List<Movie> findByDirector(String director) {
        List<Movie> movies = movieMapper.findByDirectorContains(director);
        if (!movies.isEmpty()) {
            return movies;
        } else {
            throw new MovieNotFoundException("Movie not found by director");
        }
    }
}
