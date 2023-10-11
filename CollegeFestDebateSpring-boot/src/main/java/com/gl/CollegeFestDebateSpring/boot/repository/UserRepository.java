package com.gl.CollegeFestDebateSpring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CollegeFestDebateSpring.boot.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsername(String username);
}
