package com.maitreyi.movie.moviecatalogservice.moviecatalog;

public class Rating {
	
	
	private int movieId;
	private int ratingId;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int movieId, int ratingId) {
		super();
		this.movieId = movieId;
		this.ratingId = ratingId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	
	

}
