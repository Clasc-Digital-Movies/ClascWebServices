package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producer {
	@Id
	@GeneratedValue
	private long producer_id;
	private String producer_name;
	private String producer_img_path;
	public long getProducer_id() {
		return producer_id;
	}
	public void setProducer_id(long producer_id) {
		this.producer_id = producer_id;
	}
	public String getProducer_name() {
		return producer_name;
	}
	public void setProducer_name(String producer_name) {
		this.producer_name = producer_name;
	}
	public String getProducer_img_path() {
		return producer_img_path;
	}
	public void setProducer_img_path(String producer_img_path) {
		this.producer_img_path = producer_img_path;
	}
	

	
	
}
