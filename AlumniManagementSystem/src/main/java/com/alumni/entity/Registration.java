package com.alumni.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="register")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	@Column(name="register_Id")
	private Long registerId;
	private String username;
	private String password;
	@Column(name="email_Id")
	private String emailId;
	@Column(name="mobile_number")
	private Long mobilenumber;
	private String city;
	@Column(name="current_position")
	private String currentposition;
	@Column(name="graduation_year")
	private Long graduationyear;
	@Column(name="image_url")
	private String imageurl;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(Long sno, Long registerId, String username, String password, String emailId, Long mobilenumber,
			String city, String currentposition, Long graduationyear, String imageurl) {
		super();
		this.sno = sno;
		this.registerId = registerId;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.mobilenumber = mobilenumber;
		this.city = city;
		this.currentposition = currentposition;
		this.graduationyear = graduationyear;
		this.imageurl = imageurl;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public Long getRegisterId() {
		return registerId;
	}
	public void setRegisterId(Long registerId) {
		this.registerId = registerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCurrentposition() {
		return currentposition;
	}
	public void setCurrentposition(String currentposition) {
		this.currentposition = currentposition;
	}
	public Long getGraduationyear() {
		return graduationyear;
	}
	public void setGraduationyear(Long graduationyear) {
		this.graduationyear = graduationyear;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
}
