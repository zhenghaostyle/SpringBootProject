package com.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.junit4.SpringRunner;

import com.Application;
import com.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testFindByName() {
		String name = "ss";
		User user = userRepository.findByName(name);
		assertEquals(name, user.getName());
	}

	@Test
	public void testFindOne() {
		String name = "ss";
		User user = new User();
		user.setName(name);

		// ExampleMatcher matcher =
		// ExampleMatcher.matching().withIgnorePaths("id");

		// Example<User> example = Example.of(user, matcher);
		Example<User> example = Example.of(user);
		User result = userRepository.findOne(example);
		
		assertEquals(name, result.getName());
	}
}
