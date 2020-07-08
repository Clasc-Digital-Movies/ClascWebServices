package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CardDetails {
	
	@Id
	@GeneratedValue
	private long card_id;
	private long card_number;
	private String nameCardOwner;
	
	
	public long getCard_id() {
		return card_id;
	}
	public void setCard_id(long card_id) {
		this.card_id = card_id;
	}
	public long getCard_number() {
		return card_number;
	}
	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}
	public String getNameCardOwner() {
		return nameCardOwner;
	}
	public void setNameCardOwner(String nameCardOwner) {
		this.nameCardOwner = nameCardOwner;
	}
	

}
