package com.uk.mybatisdemo202401;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieMapper movieMapper;

    public MovieService(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movie> findAll() {
        return movieMapper.findAll();
    }
}
