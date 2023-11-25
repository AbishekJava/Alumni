package com.alumni.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="events")
public class event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	private String topic;
	@Column(name="image_url")
	private String image_url;
	private String description;
	public event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public event(Long sno, String topic, String image_url, String description) {
		super();
		this.sno = sno;
		this.topic = topic;
		this.image_url = image_url;
		this.description = description;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
