package com.charan.repository;

import org.springframework.data.repository.CrudRepository;

import com.charan.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
