package com.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Application;
import com.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class User1RepositoryTest {

	@Autowired
	private User1Repository userRepository;

	@Test
	public void testFindAllPageable() {
		Page<User> page = userRepository.findAll(new PageRequest(0, 2));
		List<User> users = page.getContent();//转化为list
		assertEquals(1, users.size());
	}

	@Test
	public void testFindByLastname() {
		Page<User> page = userRepository.findByLastname("s", new PageRequest(0, 2));
		assertEquals(1, page.getNumberOfElements());
	}

}
