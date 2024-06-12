package com.charan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users_data")
public class Users {
	@Id
	@Column(name="User-Id")
	private Integer userId;
	@Column(name="User-Name")
	private String userName;
	@Column(name="User-Age")
	private Integer userAge;
	@Column(name="Location")
	private String location;

}
