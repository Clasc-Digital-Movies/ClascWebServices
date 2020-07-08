package com.clasc.clascWebService.pojo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Movies {
	
	@Id
	@GeneratedValue
	private long movie_id;
	private char adult_Sw;
	private String backdrop_path;
	private long budget;
	private String homePage;
	private long imdb_Id;
	private String orig_lang;
	private String orig_title;
	private String overView;   //CLOB may be?? 
	private String popularity;
	
	private String poster_path;
	private Date releaseDt;
	private long revenue; 
	private long runtime;
	private String status;
	private String tagline;
	private String title;
	private String video;
	private long vote_avg;
	private long vote_cnt;
	private long col_98;
	
	
	
	public long getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}
	public char getAdult_Sw() {
		return adult_Sw;
	}
	public void setAdult_Sw(char adult_Sw) {
		this.adult_Sw = adult_Sw;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public long getImdb_Id() {
		return imdb_Id;
	}
	public void setImdb_Id(long imdb_Id) {
		this.imdb_Id = imdb_Id;
	}
	public String getOrig_lang() {
		return orig_lang;
	}
	public void setOrig_lang(String orig_lang) {
		this.orig_lang = orig_lang;
	}
	public String getOrig_title() {
		return orig_title;
	}
	public void setOrig_title(String orig_title) {
		this.orig_title = orig_title;
	}
	public String getOverView() {
		return overView;
	}
	public void setOverView(String overView) {
		this.overView = overView;
	}
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public Date getReleaseDt() {
		return releaseDt;
	}
	public void setReleaseDt(Date releaseDt) {
		this.releaseDt = releaseDt;
	}
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	public long getRuntime() {
		return runtime;
	}
	public void setRuntime(long runtime) {
		this.runtime = runtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public long getVote_avg() {
		return vote_avg;
	}
	public void setVote_avg(long vote_avg) {
		this.vote_avg = vote_avg;
	}
	public long getVote_cnt() {
		return vote_cnt;
	}
	public void setVote_cnt(long vote_cnt) {
		this.vote_cnt = vote_cnt;
	}
	public long getCol_98() {
		return col_98;
	}
	public void setCol_98(long col_98) {
		this.col_98 = col_98;
	}

}
