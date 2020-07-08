package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Writer {
	
	@Id
	@GeneratedValue
	private long writer_id;
	private String writer_name;
	private String writer_img_path;
	
	public long getWriter_id() {
		return writer_id;
	}
	public void setWriter_id(long writer_id) {
		this.writer_id = writer_id;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
	public String getWriter_img_path() {
		return writer_img_path;
	}
	public void setWriter_img_path(String writer_img_path) {
		this.writer_img_path = writer_img_path;
	}
	
	
	

}
