package com.contactlist.spring.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


//ESTA PRUEBA COMPRUEBA SI HAY UN USUARIO EN LA BASE DE DATOS QUE SE APELLIDE "SANCHEZ"
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CSTestCarlos {

	 @org.springframework.boot.web.server.LocalServerPort
	    private int port;
	 
	 @Autowired
	 private TestRestTemplate restTemplate;
	 
	 @Test
	 public void greetingShouldReturnDefaultMessage() throws Exception{
		 
		 assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/add",
	                String.class).contains("lE"));
		 
	 }
	 
}
