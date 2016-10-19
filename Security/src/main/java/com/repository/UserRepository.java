package com.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

	@Query("select u from User u where u.name= :name and u.password= :password")
	User findByNameAndPassword(@Param("name") String name, @Param("password") String password);

	@Query("select u from User u where u.name= :name")
	User getByUsername(@Param("name") String username);

}
