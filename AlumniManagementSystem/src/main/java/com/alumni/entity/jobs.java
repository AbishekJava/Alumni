package com.alumni.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jobs")
public class jobs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	@Column(name="company_name")
	private String companyname;
	private Long vacant;
	@Column(name="work_mode")
	private String workmode;
	private String edu;
	private Long experie;
	private String skills;
	private Float salary;
	private String location;
	@Column(name="last_date")
	private String lastdate;
	private String link;
	public jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public jobs(Long sno, String companyname, Long vacant, String workmode, String edu, Long experie, String skills,
			Float salary, String location, String lastdate, String link) {
		super();
		this.sno = sno;
		this.companyname = companyname;
		this.vacant = vacant;
		this.workmode = workmode;
		this.edu = edu;
		this.experie = experie;
		this.skills = skills;
		this.salary = salary;
		this.location = location;
		this.lastdate = lastdate;
		this.link = link;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Long getVacant() {
		return vacant;
	}
	public void setVacant(Long vacant) {
		this.vacant = vacant;
	}
	public String getWorkmode() {
		return workmode;
	}
	public void setWorkmode(String workmode) {
		this.workmode = workmode;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public Long getExperie() {
		return experie;
	}
	public void setExperie(Long experie) {
		this.experie = experie;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLastdate() {
		return lastdate;
	}
	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
}
