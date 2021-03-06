package com.maitreyi.movieservice.movieinfoservice.movieController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maitreyi.movieservice.movieinfoservice.Movie.Movie;

@RestController
@RequestMapping ("/movieInfo")
public class MovieController {
	
private List<Movie> movieArray=new ArrayList<Movie>(Arrays.asList(
			
			new Movie(1, "Movie-1", "Desc-1"),
			new Movie(2, "Movie-2", "Desc-2"),
			new Movie(3, "Movie-3", "Desc-3"),
			new Movie(4, "Movie-4", "Desc-4"),
			new Movie(5, "Movie-5", "Desc-5")
			));
	

	@RequestMapping ("/movies")
	public List<Movie> getAllMovies()
	{
		System.out.println("Inside Movies Controller");
		return movieArray;
	}
	
	@RequestMapping ("/callFromCatalog/{movieId}")
	public Movie getOneMovie(@PathVariable ("movieId") int movieId)
	{
		System.out.println("Inside callFromCatalog Movie Controller");
		return movieArray.stream().filter(m-> m.getMovieId()==movieId).findFirst().orElse(null);
	}
	


}
