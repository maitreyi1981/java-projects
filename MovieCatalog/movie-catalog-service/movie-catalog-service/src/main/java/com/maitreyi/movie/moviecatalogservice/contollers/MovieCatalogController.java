package com.maitreyi.movie.moviecatalogservice.contollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maitreyi.movie.moviecatalogservice.moviecatalog.*;



@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;

	
	@RequestMapping ("/singleMovie/{movieId}")
	public MovieCatalog getMovieCatalog(@PathVariable("movieId") int  movieId)
	{
		System.out.println("inside catalog single movie controller");
		 
		Movie movie=restTemplate.getForObject("http://movie-info-service/movieInfo/callFromCatalog/" +movieId, Movie.class);
		Rating rating=restTemplate.getForObject("http://localhost:8082/rating/" + movie.getMovieId(), Rating.class);
		return new MovieCatalog(1,movie.getMovieId(),movie.getMovieName(),movie.getMovieDescription(),rating.getRatingId());
	}
	
	@RequestMapping ("/allMovies")
	public List<MovieCatalog> getAllMovies()
	{
		List<MovieCatalog> movieCatalogs=new ArrayList<MovieCatalog>();
		List<Movie> movieList=new ArrayList<Movie>();
		ObjectMapper mapper=new ObjectMapper();
		System.out.println("inside catalog  movies controller");
		
		 
		movieList=restTemplate.getForObject("http://movie-info-service/movieInfo/movies", ArrayList.class);
		
		List<Movie> movieList1 = mapper.convertValue(
				movieList,
			    new TypeReference<List<Movie>>() { });
		
		movieList1.forEach(m-> 
				{
					System.out.println(m.getMovieName());
					Rating rating=restTemplate.getForObject("http://rating-info-service/rating/" + m.getMovieId(), Rating.class);
					movieCatalogs.add(new MovieCatalog(1,m.getMovieId(),m.getMovieName(),m.getMovieDescription(),rating.getRatingId()));
				}
							);
		    System.out.println(movieList1.size());
		    System.out.println(movieCatalogs.size());
		
		return movieCatalogs;
		
	}

}
