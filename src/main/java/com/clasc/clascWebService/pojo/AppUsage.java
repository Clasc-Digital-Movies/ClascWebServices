package com.clasc.clascWebService.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppUsage {
	
@Id
@GeneratedValue
	
	private long instance_id;
	private long visit_id;
	private Date dateTime;
	private String screeName; //Home/Upcoming Movies/Search
	private long upcomingMoviesClicked;
	private long searchClicked;
	private long searchTermEntered;
	private char searchResultsDisplayed;
	private long searchResultNum;
		
	
	public long getInstance_id() {
		return instance_id;
	}
	public void setInstance_id(long instance_id) {
		this.instance_id = instance_id;
	}
	public long getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(long visit_id) {
		this.visit_id = visit_id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getScreeName() {
		return screeName;
	}
	public void setScreeName(String screeName) {
		this.screeName = screeName;
	}
	public long getUpcomingMoviesClicked() {
		return upcomingMoviesClicked;
	}
	public void setUpcomingMoviesClicked(long upcomingMoviesClicked) {
		this.upcomingMoviesClicked = upcomingMoviesClicked;
	}
	public long getSearchClicked() {
		return searchClicked;
	}
	public void setSearchClicked(long searchClicked) {
		this.searchClicked = searchClicked;
	}
	public long getSearchTermEntered() {
		return searchTermEntered;
	}
	public void setSearchTermEntered(long searchTermEntered) {
		this.searchTermEntered = searchTermEntered;
	}
	public char getSearchResultsDisplayed() {
		return searchResultsDisplayed;
	}
	public void setSearchResultsDisplayed(char searchResultsDisplayed) {
		this.searchResultsDisplayed = searchResultsDisplayed;
	}
	public long getSearchResultNum() {
		return searchResultNum;
	}
	public void setSearchResultNum(long searchResultNum) {
		this.searchResultNum = searchResultNum;
	}
	public long getSearchMovieId() {
		return searchMovieId;
	}
	public void setSearchMovieId(long searchMovieId) {
		this.searchMovieId = searchMovieId;
	}
	public long getBookNowClicked() {
		return bookNowClicked;
	}
	public void setBookNowClicked(long bookNowClicked) {
		this.bookNowClicked = bookNowClicked;
	}
	public long getMoreClicked() {
		return moreClicked;
	}
	public void setMoreClicked(long moreClicked) {
		this.moreClicked = moreClicked;
	}
	public long getPostponeClicked() {
		return postponeClicked;
	}
	public void setPostponeClicked(long postponeClicked) {
		this.postponeClicked = postponeClicked;
	}
	public long getCancelClicked() {
		return cancelClicked;
	}
	public void setCancelClicked(long cancelClicked) {
		this.cancelClicked = cancelClicked;
	}
	private long searchMovieId;
	private long bookNowClicked;
	private long moreClicked;
	private long postponeClicked;
	private long cancelClicked;
}
