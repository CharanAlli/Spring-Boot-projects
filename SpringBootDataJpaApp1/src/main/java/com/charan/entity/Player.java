package com.charan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cricket_Players")
public class Player {
	@Id
	@Column(name="Player-Id")
	private Integer playerId;
	@Column(name="Player-Name")
	private String playerName;
	@Column(name="Player-Age")
	private Integer playerAge;
	@Column(name="Location")
	private String location;
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Player() {
		
	}
	
	public Player(Integer playerId, String playerName, Integer playerAge, String location) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", location=" + location + "]";
	}
	
}
