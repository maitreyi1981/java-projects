package com.maitreyi.movie.moviecatalogservice.moviecatalog;

public class MovieCatalog {
	
	
	private int userId;
	private int movieId;
	private String movieName;
	private String movieDescription;
	private int ratingsId;
	
	public MovieCatalog()
	{
		super();
	}
	
	public MovieCatalog(int userId, int movieId, String moviename, String movieDescription, int ratingsId) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.movieName=moviename;
		this.movieDescription = movieDescription;
		this.ratingsId = ratingsId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public int getRatingsId() {
		return ratingsId;
	}
	public void setRatingsId(int ratingsId) {
		this.ratingsId = ratingsId;
	}
	
	@Override
	public String toString()
	{
		return ("Movie Id :" + movieId + ", movie name : " + movieName+ ", Description :" + movieDescription + ", Ratings : " + ratingsId);
	}

	public String getMoviveName() {
		return movieName;
	}

	public void setMoviveName(String movieName) {
		this.movieName = movieName;
	}

}
