package com.uk.mybatisdemo202401;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE id = #{id}")
    Optional<Movie> findById(int id);

    @Select("SELECT * FROM movies WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Movie> findByNameContains(String movieName);

    @Select("SELECT * FROM movies WHERE director LIKE CONCAT('%', #{director}, '%')")
    List<Movie> findByDirectorContains(String director);
}
