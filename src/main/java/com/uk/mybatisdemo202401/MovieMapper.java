package com.uk.mybatisdemo202401;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Movie> findByNameContains(String prefix);

    @Select("SELECT * FROM movies WHERE director LIKE CONCAT('%', #{director}, '%')")
    List<Movie> findByDirectorContains(String director);
}
