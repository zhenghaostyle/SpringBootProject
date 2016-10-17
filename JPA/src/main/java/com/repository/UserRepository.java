package com.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

	@Query("select u from User u where u.name= :name")
	User findByName(@Param("name") String name);

	User findOne(Example<User> example);

}
