package com.charan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charan.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
