package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieDetailGenres {
	
	@Id
	@GeneratedValue
	private long movie_genre_id;
	private String genre_name;
	
	
	
	
	public long getMovie_genre_id() {
		return movie_genre_id;
	}

	public void setMovie_genre_id(long movie_genre_id) {
		this.movie_genre_id = movie_genre_id;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

	
	

}
