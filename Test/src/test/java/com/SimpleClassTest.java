package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SimpleClassTest {

	@Autowired
	private SimpleClass simpleClass;

	@Test
	public void testGetName() {
		Assert.assertEquals("SimpleClass", simpleClass.getName());
	}

}
