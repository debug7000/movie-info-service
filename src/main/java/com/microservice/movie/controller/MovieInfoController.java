package com.microservice.movie.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.movie.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		
		return new Movie(movieId,"radhe","radhe");
		
	}
	
	

}
