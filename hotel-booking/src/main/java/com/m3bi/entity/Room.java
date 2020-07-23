package com.m3bi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="CHARGE")
	private int charge;
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	@Column(name="STATUS")
	private String status;
	@Column(name="MAPPED_USER_ID")
	private Integer mappedUserId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMappedUserId() {
		return mappedUserId;
	}
	public void setMappedUserId(int mappedUserId) {
		this.mappedUserId = mappedUserId;
	}
}
