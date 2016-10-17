package com.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.domain.User;

public interface User1Repository extends PagingAndSortingRepository<User, String> {

	Page<User> findAll(Pageable pageable);

	@Query(value = "SELECT u FROM User u WHERE u.name = ?1", countQuery = "SELECT count(*) FROM User u WHERE u.name = ?1")
	Page<User> findByLastname(String name, Pageable pageable);

}
