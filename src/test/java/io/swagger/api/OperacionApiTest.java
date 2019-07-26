package io.swagger.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class OperacionApiTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testSumaCorrecta() {

	}

	@Test
	public void testSumaParametrosNull() {

	}

	@Test
	public void testRestaCorrecta() {

	}

	@Test
	public void testRestaParametrosNull() {

	}

}
