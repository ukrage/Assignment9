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

    public Movie findById(int id) {
        Optional<Movie> movie = movieMapper.findById(id);
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new MovieNotFoundException("Movie not found");
        }
    }

    public List<Movie> findBy(String movieName, String directorName) {
        if (movieName.isEmpty() && directorName.isEmpty()) {
            return movieMapper.findAll();
        } else {
            return movieMapper.findBy(movieName, directorName);
        }
    }
}
