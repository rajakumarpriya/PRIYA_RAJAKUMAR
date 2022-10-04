package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.models.DAOUser;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
	UserDao findByUsername(String username);
}
