package com.maitreyi.ratingservice.ratingsdataservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maitreyi.ratingservice.ratingsdataservice.rating.Rating;

@RestController
@RequestMapping ("/rating")
public class Ratingcontroller {
	
	
private List<Rating> ratingArray=new ArrayList<Rating>(Arrays.asList(
			
			new Rating(1,1),
			new Rating(2,2),
			new Rating(3,3),
			new Rating(4,4),
			new Rating(5,5)
			));
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") int movieId)
	{
		System.out.println("inside rating controller");
		return ratingArray.stream().filter(r-> r.getMovieId()==movieId).findFirst().orElse(null);
	}

}
