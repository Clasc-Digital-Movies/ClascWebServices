package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieDetailBelongsToCollection {

	@Id
	@GeneratedValue
	private long movie_coll_id;
	private String movie_coll_name;
	private String backdrop_path;
	private String poster_path;
	
	
	public long getMovie_coll_id() {
		return movie_coll_id;
	}
	public void setMovie_coll_id(long movie_coll_id) {
		this.movie_coll_id = movie_coll_id;
	}
	public String getMovie_coll_name() {
		return movie_coll_name;
	}
	public void setMovie_coll_name(String movie_coll_name) {
		this.movie_coll_name = movie_coll_name;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	
		
}
